
/**
 * AWTFrameFactory.java
 *
 *
 * Created: Sun Nov 14 18:18:32 1999
 *
 * @author Jan Newmarch
 * @version 1.0
 */

package ui;

import java.util.Map;

public class AWTFrameFactory extends UIFactory {

    public AWTFrameFactory() {
	super();
    }
        
    public AWTFrameFactory(String name, String role) {
	super(name, role);
    }

    public AWTFrameFactory(String name, String role, Map properties) {
	super(name, role, properties);
    }

} // AWTFrameFactory
