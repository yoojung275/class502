package Coffee;

import java.util.HashMap;

public class StarBucks extends SameThing {
    private static final HashMap<String, Integer> menus;

    static {
        menus = new HashMap<>();
        menus.put("아메리카노", 4000);
        menus.put("라떼", 5000);
    }
}

