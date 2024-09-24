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

package org.pentaho.reporting.libraries.pixie.wmf.records;

import org.pentaho.reporting.libraries.pixie.wmf.MfLogBrush;
import org.pentaho.reporting.libraries.pixie.wmf.MfRecord;
import org.pentaho.reporting.libraries.pixie.wmf.MfType;
import org.pentaho.reporting.libraries.pixie.wmf.WmfFile;
import org.pentaho.reporting.libraries.pixie.wmf.bitmap.DIBReader;

import java.awt.image.BufferedImage;
import java.io.IOException;

// This structure should include a bitmap. This implementation does
// not know of any bitmaps right now, so this records is ignored.
// todo ...

public class MfCmdCreateDibPatternBrush extends MfCmd {
  private static final int POS_BITMAP_TYPE = 0;
  private static final int POS_PALETTE_TYPE = 1;
  private static final int POS_BITMAP_INFO_STRUCT = 2;
  // bitmap data follows the bitmap header ...

  private BufferedImage image;

  public MfCmdCreateDibPatternBrush() {
  }

  /**
   * Creates a new record based on the data stored in the MfCommand.
   *
   * @return the created record.
   */
  public MfRecord getRecord()
    throws RecordCreationException {
    /**
     * Requires a DIB-Writer, this is not yet supported
     */
    throw new RecordCreationException( "CreateDIBPatternBrush is not yet supported" );
  }

  /**
   * Reads the command data from the given record and adjusts the internal parameters according to the data parsed.
   * <p/>
   * After the raw record was read from the datasource, the record is parsed by the concrete implementation.
   *
   * @param record the raw data that makes up the record.
   */
  public void setRecord( final MfRecord record ) {
    try {
      final DIBReader reader = new DIBReader();
      setImage( reader.setRecord( record ) );
    } catch ( IOException ioe ) {
      // failed to load the bitmap ..
    }
  }

  public BufferedImage getImage() {
    return image;
  }

  public void setImage( final BufferedImage image ) {
    if ( image == null ) {
      throw new NullPointerException();
    }
    this.image = image;
  }

  public String toString() {
    final StringBuffer b = new StringBuffer();
    b.append( "[CREATE_DIB_PATTERN_BRUSH] " );
    b.append( " no internals known " );
    return b.toString();
  }

  /**
   * Reads the function identifier. Every record type is identified by a function number corresponding to one of the
   * Windows GDI functions used.
   *
   * @return the function identifier.
   */
  public int getFunction() {
    return MfType.CREATE_DIB_PATTERN_BRUSH;
  }

  /**
   * Replays the command on the given WmfFile.
   *
   * @param file the meta file.
   */
  public void replay( final WmfFile file ) {
    final MfLogBrush lbrush = new MfLogBrush();
    lbrush.setStyle( MfLogBrush.BS_DIBPATTERN );
    lbrush.setBitmap( image );

    file.getCurrentState().setLogBrush( lbrush );
    file.storeObject( lbrush );
  }

  /**
   * Creates a empty unintialized copy of this command implementation.
   *
   * @return a new instance of the command.
   */
  public MfCmd getInstance() {
    return new MfCmdCreateDibPatternBrush();
  }

  /**
   * A callback function to inform the object, that the x scale has changed and the internal coordinate values have to
   * be adjusted. Not used here.
   */
  protected void scaleXChanged() {
  }

  /**
   * A callback function to inform the object, that the y scale has changed and the internal coordinate values have to
   * be adjusted. Not used here.
   */
  protected void scaleYChanged() {
  }

}
