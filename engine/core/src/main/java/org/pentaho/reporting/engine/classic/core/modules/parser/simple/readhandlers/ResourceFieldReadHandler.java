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

package org.pentaho.reporting.engine.classic.core.modules.parser.simple.readhandlers;

import org.pentaho.reporting.engine.classic.core.elementfactory.ResourceFieldElementFactory;
import org.pentaho.reporting.engine.classic.core.elementfactory.TextFieldElementFactory;
import org.pentaho.reporting.engine.classic.core.modules.parser.base.PropertyAttributes;
import org.xml.sax.SAXException;

public class ResourceFieldReadHandler extends StringFieldReadHandler {
  public ResourceFieldReadHandler() {
    super( new ResourceFieldElementFactory() );
  }

  protected ResourceFieldReadHandler( final TextFieldElementFactory textFieldElementFactory ) {
    super( textFieldElementFactory );
  }

  /**
   * Starts parsing.
   *
   * @param atts
   *          the attributes.
   * @throws org.xml.sax.SAXException
   *           if there is a parsing error.
   */
  protected void startParsing( final PropertyAttributes atts ) throws SAXException {
    super.startParsing( atts );
    final ResourceFieldElementFactory elementFactory = (ResourceFieldElementFactory) getElementFactory();
    elementFactory.setResourceBase( atts.getValue( getUri(), "resource-base" ) );
  }
}
