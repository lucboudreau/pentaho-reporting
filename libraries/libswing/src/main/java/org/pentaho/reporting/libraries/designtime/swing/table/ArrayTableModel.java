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

package org.pentaho.reporting.libraries.designtime.swing.table;

import org.pentaho.reporting.libraries.designtime.swing.Messages;
import org.pentaho.reporting.libraries.designtime.swing.bulk.BulkDataProvider;

import javax.swing.table.AbstractTableModel;
import java.beans.PropertyEditor;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTableModel extends AbstractTableModel implements BulkDataProvider, PropertyTableModel {
  private ArrayList<Object> data;
  private Class type;
  private Class propertyEditorType;
  private String columnTitle;
  private boolean editable;

  public ArrayTableModel() {
    editable = true;
    data = new ArrayList<Object>();
    type = Object.class;
    columnTitle = Messages.getInstance().getString( "ArrayTableModel.Value" );
  }

  public boolean isEditable() {
    return editable;
  }

  public void setEditable( final boolean editable ) {
    this.editable = editable;
  }

  public Object[] getData() {
    return data.toArray();
  }

  public <T> void setData( final T[] data, final Class<T> componentType ) {
    if ( componentType == null ) {
      throw new NullPointerException();
    }
    if ( data == null ) {
      throw new NullPointerException();
    }
    this.data.clear();
    this.data.addAll( Arrays.asList( data ) );
    this.type = componentType;

    fireTableDataChanged();
  }

  public int getRowCount() {
    return data.size();
  }

  public int getColumnCount() {
    return 1;
  }

  public Object getValueAt( final int rowIndex, final int columnIndex ) {
    return data.get( rowIndex );
  }

  public void setValueAt( final Object aValue, final int rowIndex, final int columnIndex ) {
    data.set( rowIndex, aValue );
    fireTableCellUpdated( rowIndex, columnIndex );
  }

  public boolean isCellEditable( final int rowIndex, final int columnIndex ) {
    return editable;
  }

  public Class getColumnClass( final int columnIndex ) {
    return type;
  }

  public String getColumnName( final int column ) {
    return columnTitle;
  }

  public void add( final Object o ) {
    data.add( o );
    fireTableDataChanged();
  }

  public void add( final int idx, final Object item ) {
    data.add( idx, item );
    fireTableDataChanged();
  }

  public Object get( final int index ) {
    return data.get( index );
  }

  public void remove( final int index ) {
    data.remove( index );
    fireTableDataChanged();
  }

  public void clear() {
    data.clear();
    fireTableDataChanged();
  }

  public Object[] toArray() {
    return getData();
  }

  public int getSize() {
    return getRowCount();
  }

  public int getBulkDataSize() {
    return getRowCount();
  }

  public Object[] getBulkData() {
    return getData();
  }

  public void setBulkData( final Object[] data ) {
    setData( data, type );
  }

  public Class getClassForCell( final int row, final int column ) {
    return type;
  }

  public Class getType() {
    return type;
  }

  public void setType( final Class type ) {
    this.type = type;
  }

  public Class getPropertyEditorType() {
    return propertyEditorType;
  }

  public void setPropertyEditorType( final Class propertyEditorType ) {
    this.propertyEditorType = propertyEditorType;
  }

  public PropertyEditor getEditorForCell( final int row, final int column ) {
    if ( propertyEditorType == null ) {
      return null;
    }
    try {
      return (PropertyEditor) propertyEditorType.newInstance();
    } catch ( Exception e ) {
      return null;
    }
  }
}
