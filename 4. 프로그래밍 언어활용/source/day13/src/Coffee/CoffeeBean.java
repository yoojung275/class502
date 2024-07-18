package Coffee;

import java.util.HashMap;
import java.util.Map;

public class CoffeeBean extends SameThing {
    private static final HashMap<String, Integer> menus;

    static {
        menus = new HashMap<>();
        menus.put("아메리카노", 3000);
        menus.put("라떼", 4500);
    }


}


