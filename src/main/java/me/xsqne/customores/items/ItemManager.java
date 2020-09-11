package me.xsqne.customores.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemManager {
    public static ItemStack silver;
    public static ItemStack silverSword;
    public static ItemStack bronze;
    public static ItemStack cshard;
    public static ItemStack silverHelmet;
    public static ItemStack soulScythe;


    public static void init() {
        createSilver();
        createBronze();
        createCshard();
        createSoulScythe();
    }

    private static void createSilver() {
        ItemStack item = new ItemStack(Material.IRON_INGOT, 10);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RESET + "Silver");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        silver = item;
    }

    private static void createBronze() {
        ItemStack item = new ItemStack(Material.GOLD_INGOT, 10);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RESET + "Bronze");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        bronze = item;
    }

    private static void createCshard() {
        ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 10);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RESET + "Crystal Shard");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        cshard = item;
    }

    private static void createSilverSword() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RESET + "Silver Sword");
        AttributeModifier modifier = new AttributeModifier("dmg", 4, AttributeModifier.Operation.ADD_NUMBER);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, modifier);
        item.setItemMeta(meta);
        silverSword = item;
    }

    private static void createSilverHelmet() {
        ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RESET + "Silver Helmet");
        AttributeModifier modifier = new AttributeModifier("prot", 4, AttributeModifier.Operation.ADD_NUMBER);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        item.setItemMeta(meta);
        silverHelmet = item;
    }

    public static void createSoulScythe() {
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RESET + "Soul Scythe");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        ArrayList<String> lore = new ArrayList();
        lore.add("Forged from the fires of the Nether");
        meta.setLore(lore);
        item.setItemMeta(meta);
        soulScythe = item;
    }
}
