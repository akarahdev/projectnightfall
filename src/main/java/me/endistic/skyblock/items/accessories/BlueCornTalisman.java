package me.endistic.skyblock.items.accessories;

import me.endistic.skyblock.items.*;
import me.endistic.skyblock.items.crafting.Recipe;
import me.endistic.skyblock.stats.StatsObject;
import org.bukkit.Material;

import java.util.List;

public class BlueCornTalisman extends CustomItemTemplate {
    public ItemMetadata getItemData() {
        return new ItemMetadata()
            .setMaterial(Material.PLAYER_HEAD)
            .setTexture(ItemTexture.BLUE_CORN)
            .setName("Blue Corn Talisman")
            .setType(ItemSlot.ACCESSORY)
            .setRarity(Rarity.DIVINE);
    }

    public StatsObject getStats() {
        return new StatsObject();
    }

    public String getId() {
        return "blue_corn_talisman";
    }

    @Override
    public List<Recipe> getRecipe() {
        return List.of(
            new Recipe()
                .setSlot(2, "entropic_fragment", 3)
                .setSlot(5, "warden_flux", 1)
        );
    }
}
