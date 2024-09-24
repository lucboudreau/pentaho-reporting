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

package org.pentaho.reporting.engine.classic.wizard.ui.xul;

import org.pentaho.reporting.engine.classic.core.ClassicEngineBoot;
import org.pentaho.reporting.engine.classic.core.designtime.DesignTimeContext;
import org.pentaho.reporting.engine.classic.core.modules.gui.commonswing.ExceptionDialog;
import org.pentaho.reporting.engine.classic.wizard.ui.xul.components.LinearWizardController;
import org.pentaho.reporting.engine.classic.wizard.ui.xul.components.WizardContentPanel;
import org.pentaho.reporting.engine.classic.wizard.ui.xul.steps.DataSourceAndQueryStep;
import org.pentaho.reporting.engine.classic.wizard.ui.xul.steps.FormatStep;
import org.pentaho.reporting.engine.classic.wizard.ui.xul.steps.LayoutStep;
import org.pentaho.reporting.engine.classic.wizard.ui.xul.steps.LookAndFeelStep;
import org.pentaho.ui.xul.XulDomContainer;
import org.pentaho.ui.xul.XulRunner;
import org.pentaho.ui.xul.binding.DefaultBindingFactory;
import org.pentaho.ui.xul.containers.XulDialog;
import org.pentaho.ui.xul.dom.Document;
import org.pentaho.ui.xul.swing.SwingXulLoader;
import org.pentaho.ui.xul.swing.SwingXulRunner;

import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class StandaloneWizard {
  private class CloseListener implements PropertyChangeListener {
    private CloseListener() {
    }

    /**
     * This method gets called when a bound property is changed.
     *
     * @param evt A PropertyChangeEvent object describing the event source and the property that has changed.
     */
    public void propertyChange( final PropertyChangeEvent evt ) {
      if ( wizardController.isCancelled() || wizardController.isFinished() ) {
        System.exit( 0 );
      }
    }
  }

  private final static String MAIN_WIZARD_PANEL =
    "org/pentaho/reporting/engine/classic/wizard/ui/xul/res/main_wizard_panel.xul"; //$NON-NLS-1$

  private LinearWizardController wizardController;

  public StandaloneWizard() {
    wizardController = new LinearWizardController( new WizardEditorModel(), new DefaultBindingFactory() );
    wizardController.addPropertyChangeListener( new CloseListener() );

    final DataSourceAndQueryStep dataSourceAndQueryStep = new DataSourceAndQueryStep();

    // add the steps ..
    wizardController.addStep( new LookAndFeelStep() );
    wizardController.addStep( dataSourceAndQueryStep );
    wizardController.addStep( new LayoutStep() );
    wizardController.addStep( new FormatStep() );


    try {
      final XulDomContainer mainWizardContainer = new SwingXulLoader().loadXul( MAIN_WIZARD_PANEL );
      new WizardContentPanel( wizardController ).addContent( mainWizardContainer );

      wizardController.registerMainXULContainer( mainWizardContainer );

      final Document documentRoot = mainWizardContainer.getDocumentRoot();
      final XulDialog root = (XulDialog) documentRoot.getRootElement();
      final Window window = (Window) root.getRootObject();
      final DesignTimeContext designTimeContext =
        new DefaultWizardDesignTimeContext( wizardController.getEditorModel(), window );
      dataSourceAndQueryStep.setDesignTimeContext( designTimeContext );
      wizardController.setDesignTimeContext( designTimeContext );

      final XulRunner runner = new SwingXulRunner();
      runner.addContainer( mainWizardContainer );

      runner.initialize();
      runner.start();

    } catch ( Exception e ) {
      ExceptionDialog.showExceptionDialog( null, "Error", e.getMessage(), e );
    }

  }

  public static void main( final String[] args ) {
    ClassicEngineBoot.getInstance().start();
    new StandaloneWizard();
  }
}
