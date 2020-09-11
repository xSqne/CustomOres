package me.xsqne.customores;

import me.xsqne.customores.commands.CommandGive;
import me.xsqne.customores.commands.CommandOres;
import me.xsqne.customores.items.ItemManager;
import me.xsqne.customores.recipes.RecipeManager;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomOres extends JavaPlugin {
    @Override
    public void onEnable() {
        ItemManager.init();
        /*RecipeManager rm = new RecipeManager();
        getServer().addRecipe(rm.recipeSilverPickaxe());
        getServer().addRecipe(rm.recipeSilverSword());*/
        this.getCommand("ores").setExecutor(new CommandOres());
        this.getCommand("citem").setExecutor(new CommandGive());
    }

    @Override
    public void onDisable() {

    }
}
