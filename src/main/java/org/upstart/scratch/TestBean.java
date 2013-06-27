package org.upstart.scratch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <p>I am a...</p>
 *
 * @author Brian Miller (bmiller@motio.com)
 * @version $Id: $
 */
@Component
public class TestBean {
   private final static Logger log = LoggerFactory.getLogger(TestBean.class);

   private String name = "CompnentName";

   public String getName () {
      return name;
   }

   public void setName (String aName) {
      name = aName;
   }
}
