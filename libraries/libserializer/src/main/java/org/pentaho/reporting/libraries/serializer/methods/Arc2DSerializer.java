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

package org.pentaho.reporting.libraries.serializer.methods;

import org.pentaho.reporting.libraries.serializer.SerializeMethod;

import java.awt.geom.Arc2D;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * A serialize-Method for Arc-2D Shapes.
 *
 * @author Thomas Morgner
 */
public class Arc2DSerializer implements SerializeMethod {
  /**
   * Default constructor.
   */
  public Arc2DSerializer() {
  }

  /**
   * Writes a serializable object description to the given object output stream.
   *
   * @param o      the to be serialized object.
   * @param stream the outputstream that should receive the object.
   * @throws IOException if an I/O error occured.
   */
  public void writeObject( final Object o, final ObjectOutputStream stream ) throws IOException {
    final Arc2D arc = (Arc2D) o;
    stream.writeDouble( arc.getX() );
    stream.writeDouble( arc.getY() );
    stream.writeDouble( arc.getWidth() );
    stream.writeDouble( arc.getHeight() );
    stream.writeDouble( arc.getAngleStart() );
    stream.writeDouble( arc.getAngleExtent() );
    stream.writeInt( arc.getArcType() );
  }

  /**
   * Reads the object from the object input stream.
   *
   * @param stream the object input stream from where to read the serialized data.
   * @return the generated object.
   * @throws IOException            if reading the stream failed.
   * @throws ClassNotFoundException if serialized object class cannot be found.
   */
  public Object readObject( final ObjectInputStream stream )
    throws IOException, ClassNotFoundException {
    final double x = stream.readDouble();
    final double y = stream.readDouble();
    final double w = stream.readDouble();
    final double h = stream.readDouble();
    final double as = stream.readDouble(); // Angle Start
    final double ae = stream.readDouble(); // Angle Extent
    final int at = stream.readInt();       // Arc type
    //noinspection MagicConstant
    return new Arc2D.Double( x, y, w, h, as, ae, at );
  }

  /**
   * The class of the object, which this object can serialize.
   *
   * @return the class of the object type, which this method handles.
   */
  public Class getObjectClass() {
    return Arc2D.class;
  }
}
