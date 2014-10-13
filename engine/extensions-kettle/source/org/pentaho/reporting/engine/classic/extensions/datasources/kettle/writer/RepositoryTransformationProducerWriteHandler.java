/*
 * This program is free software; you can redistribute it and/or modify it under the
 *  terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 *  Foundation.
 *
 *  You should have received a copy of the GNU Lesser General Public License along with this
 *  program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 *  or from the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU Lesser General Public License for more details.
 *
 *  Copyright (c) 2006 - 2009 Pentaho Corporation..  All rights reserved.
 */

package org.pentaho.reporting.engine.classic.extensions.datasources.kettle.writer;

import java.io.IOException;

import org.pentaho.reporting.engine.classic.core.ParameterMapping;
import org.pentaho.reporting.engine.classic.core.modules.parser.base.PasswordEncryptionService;
import org.pentaho.reporting.engine.classic.core.modules.parser.bundle.writer.BundleWriterException;
import org.pentaho.reporting.engine.classic.extensions.datasources.kettle.KettleDataFactoryModule;
import org.pentaho.reporting.engine.classic.extensions.datasources.kettle.KettleTransFromRepositoryProducer;
import org.pentaho.reporting.engine.classic.extensions.datasources.kettle.KettleTransformationProducer;
import org.pentaho.reporting.libraries.docbundle.WriteableDocumentBundle;
import org.pentaho.reporting.libraries.xmlns.common.AttributeList;
import org.pentaho.reporting.libraries.xmlns.writer.XmlWriter;

public class RepositoryTransformationProducerWriteHandler implements TransformationProducerWriteHandler
{
  public RepositoryTransformationProducerWriteHandler()
  {
  }

  public void writeKettleRepositoryProducer(final WriteableDocumentBundle bundle,
                                            final String dataSourceFileName,
                                            final XmlWriter xmlWriter,
                                            final String queryName,
                                            final KettleTransformationProducer producer) throws IOException, BundleWriterException
  {
    if (producer instanceof KettleTransFromRepositoryProducer == false) {
      throw new BundleWriterException
          ("Invalid object type registered for handler of " + KettleTransFromRepositoryProducer.class.getSimpleName());
    }
    KettleTransFromRepositoryProducer repositoryProducer = (KettleTransFromRepositoryProducer) producer;

    final AttributeList coreAttrs = new AttributeList();
    coreAttrs.setAttribute(KettleDataFactoryModule.NAMESPACE, "name", queryName);
    coreAttrs.setAttribute(KettleDataFactoryModule.NAMESPACE, "repository", repositoryProducer.getRepositoryName());
    coreAttrs.setAttribute(KettleDataFactoryModule.NAMESPACE, "directory", repositoryProducer.getDirectoryName());
    coreAttrs.setAttribute(KettleDataFactoryModule.NAMESPACE, "transformation", repositoryProducer.getTransformationName());
    coreAttrs.setAttribute(KettleDataFactoryModule.NAMESPACE, "step", repositoryProducer.getStepName());
    coreAttrs.setAttribute(KettleDataFactoryModule.NAMESPACE, "username", repositoryProducer.getUsername());
    coreAttrs.setAttribute(KettleDataFactoryModule.NAMESPACE, "password",
        PasswordEncryptionService.getInstance().encrypt(repositoryProducer.getPassword()));
    coreAttrs.setAttribute(KettleDataFactoryModule.NAMESPACE, "stop-on-error",
        String.valueOf(repositoryProducer.isStopOnError()));

    final String[] definedArgumentNames = repositoryProducer.getDefinedArgumentNames();
    final ParameterMapping[] parameterMappings = repositoryProducer.getDefinedVariableNames();
    if (definedArgumentNames.length == 0 && parameterMappings.length == 0)
    {
      xmlWriter.writeTag(KettleDataFactoryModule.NAMESPACE, "query-repository", coreAttrs, XmlWriter.CLOSE);
      return;
    }

    xmlWriter.writeTag(KettleDataFactoryModule.NAMESPACE, "query-repository", coreAttrs, XmlWriter.OPEN);
    TransformationProducerWriteHandlerLib.writeParameterAndArguments(xmlWriter, repositoryProducer);
    xmlWriter.writeCloseTag();
  }

}
