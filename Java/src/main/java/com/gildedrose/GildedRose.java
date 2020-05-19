package com.gildedrose;

import com.gildedrose.items.EnhancedItem;
import com.gildedrose.items.ItemEnhancer;

import java.util.Arrays;

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).parallel()
                .map(ItemEnhancer::enhance)
                .forEach(EnhancedItem::updateQuality);
    }

}
