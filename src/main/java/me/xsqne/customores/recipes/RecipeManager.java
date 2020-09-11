package me.xsqne.customores.recipes;

import me.xsqne.customores.items.ItemManager;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import java.awt.*;

public class RecipeManager implements Listener {

    public ShapedRecipe recipeSilverPickaxe() {
        ItemStack result = new ItemStack(Material.IRON_PICKAXE);

        @SuppressWarnings("deprecation")
        ShapedRecipe silverPickaxe = new ShapedRecipe(result);
        silverPickaxe.shape("AAA", " B ", " B ");
        silverPickaxe.setIngredient('A', (RecipeChoice) ItemManager.silver);
        silverPickaxe.setIngredient('B', Material.STICK);

        return silverPickaxe;
    }

    public ShapedRecipe recipeSilverSword() {
        ItemStack result = ItemManager.silverSword;

        @SuppressWarnings("deprecation")
        ShapedRecipe silverSword = new ShapedRecipe(result);
        silverSword.shape(" A ", " A ", " B ");
        silverSword.setIngredient('A', (RecipeChoice) ItemManager.silver);
        silverSword.setIngredient('B', Material.STICK);

        return silverSword;
    }


}
