package com.societyu.societyu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stella on 18/7/30.
 */


public class DataService {
    /**
     * Fake all the event data for now. We will refine this and connect
     * to our backend later.
     */
    public static List<Item> getEventData() {
        List<Item> itemData = new ArrayList<Item>();
        for (int i = 0; i < 3; ++i) {
            itemData.add(
                    new Item("Coral", "1184 W valley Blvd, CA 90101",
                            "This is a huge event"));
        }
        for (int i = 3; i < 7; ++i) {
            itemData.add(
                    new Item("Mauve", "1184 W valley Blvd, CA 90101",
                            "This is a huge event"));
        }

        return itemData;
    }
}

