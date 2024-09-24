/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2028-08-13
 ******************************************************************************/

package org.pentaho.reporting.libraries.formula.operators;

import org.pentaho.reporting.libraries.formula.EvaluationException;
import org.pentaho.reporting.libraries.formula.FormulaContext;
import org.pentaho.reporting.libraries.formula.lvalues.TypeValuePair;
import org.pentaho.reporting.libraries.formula.typing.ExtendedComparator;
import org.pentaho.reporting.libraries.formula.typing.TypeRegistry;
import org.pentaho.reporting.libraries.formula.typing.coretypes.LogicalType;

/**
 * Creation-Date: 31.10.2006, 16:34:11
 *
 * @author Thomas Morgner
 */
public class NotEqualOperator implements InfixOperator {
  private static final TypeValuePair RETURN_TRUE = new TypeValuePair( LogicalType.TYPE, Boolean.TRUE );
  private static final TypeValuePair RETURN_FALSE = new TypeValuePair( LogicalType.TYPE, Boolean.FALSE );
  private static final long serialVersionUID = -3928772250539654675L;

  public NotEqualOperator() {
  }

  public TypeValuePair evaluate( final FormulaContext context,
                                 final TypeValuePair value1, final TypeValuePair value2 )
    throws EvaluationException {
    final TypeRegistry typeRegistry = context.getTypeRegistry();

    final ExtendedComparator comparator =
      typeRegistry.getComparator( value1.getType(), value2.getType() );
    final boolean result = comparator.isEqual
      ( value1.getType(), value1.getValue(),
        value2.getType(), value2.getValue() );

    if ( result == false ) {
      return RETURN_TRUE;
    } else {
      return RETURN_FALSE;
    }
  }

  public int getLevel() {
    return 400;
  }

  public String toString() {
    return "<>";
  }

  /**
   * Defines the bind-direction of the operator. That direction defines, in which direction a sequence of equal
   * operators is resolved.
   *
   * @return true, if the operation is left-binding, false if right-binding
   */
  public boolean isLeftOperation() {
    return true;
  }

  /**
   * Defines, whether the operation is associative. For associative operations, the evaluation order does not matter, if
   * the operation appears more than once in an expression, and therefore we can optimize them a lot better than
   * non-associative operations (ie. merge constant parts and precompute them once).
   *
   * @return true, if the operation is associative, false otherwise
   */
  public boolean isAssociative() {
    return false;
  }

}
