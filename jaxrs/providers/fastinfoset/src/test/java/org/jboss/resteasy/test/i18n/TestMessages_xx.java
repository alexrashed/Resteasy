package org.jboss.resteasy.test.i18n;

import java.util.Locale;

/**
 * 
 * @author <a href="ron.sigal@jboss.com">Ron Sigal</a>
 * @version $Revision: 1.1 $
 *
 * Copyright Aug 24, 2015
 */
public class TestMessages_xx extends TestMessagesAbstract
{  
   @Override
   protected Locale getLocale()
   {
      return new Locale("xx");
   }
}
