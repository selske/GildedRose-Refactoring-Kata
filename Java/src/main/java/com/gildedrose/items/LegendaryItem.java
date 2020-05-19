package com.gildedrose.items;

import com.gildedrose.Item;

import static com.gildedrose.items.ItemDifference.unchanged;

public class LegendaryItem extends EnhancedItem {

    public LegendaryItem(Item item) {
        super(item);
    }

    @Override
    protected ItemDifference calculateItemChange(int sellIn) {
        return unchanged();
    }

}
