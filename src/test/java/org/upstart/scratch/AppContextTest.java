package org.upstart.scratch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>I am a...</p>
 *
 * @author Brian Miller (bmiller@motio.com)
 * @version $Id: $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
      "classpath:META-INF/spring/application-context.xml"
})
public class AppContextTest {
   private final static Logger log = LoggerFactory.getLogger(AppContextTest.class);

   @Autowired
   TestBean testBean;

   @Test
   public void test () {
      log.debug("Testing");
      System.out.println(testBean.getName());
   }
}
