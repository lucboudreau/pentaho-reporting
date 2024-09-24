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

package org.pentaho.reporting.engine.classic.core.layout.build;

import org.pentaho.reporting.engine.classic.core.ReportDefinition;
import org.pentaho.reporting.engine.classic.core.ReportElement;
import org.pentaho.reporting.engine.classic.core.layout.model.LogicalPageBox;
import org.pentaho.reporting.engine.classic.core.layout.model.RenderBox;
import org.pentaho.reporting.engine.classic.core.layout.model.RenderableReplacedContentBox;
import org.pentaho.reporting.engine.classic.core.layout.model.context.BoxDefinition;
import org.pentaho.reporting.engine.classic.core.layout.output.OutputProcessorMetaData;
import org.pentaho.reporting.engine.classic.core.states.ReportStateKey;
import org.pentaho.reporting.engine.classic.core.style.StyleSheet;

public interface RenderNodeFactory extends Cloneable {
  public LogicalPageBox createPage( final ReportDefinition report, final StyleSheet style );

  public RenderBox produceSubReportPlaceholder( final ReportElement element, final StyleSheet style,
      final ReportStateKey stateKey );

  public RenderBox produceSectionBox( final String layoutType, final ReportStateKey stateKey );

  public RenderBox produceRenderBox( final ReportElement band, final StyleSheet style, final String layoutType,
      final ReportStateKey stateKey );

  @Deprecated
  public RenderBox createAutoParagraph( final ReportStateKey stateKey );

  public RenderBox
    createAutoParagraph( final ReportElement band, final StyleSheet style, final ReportStateKey stateKey );

  public StyleSheet createAutoGeneratedSectionStyleSheet( final StyleSheet style );

  public RenderableReplacedContentBox createReplacedContent( final ReportElement element, final StyleSheet style,
      final Object value, final Object rawValue, final ReportStateKey stateKey );

  public BoxDefinition getBoxDefinition( StyleSheet style );

  public RenderBox createPageBreakIndicatorBox( final ReportStateKey stateKey, final long range );

  public StyleSheet createStyle( StyleSheet style );

  public void close();

  void initialize( OutputProcessorMetaData outputProcessorMetaData );
}
