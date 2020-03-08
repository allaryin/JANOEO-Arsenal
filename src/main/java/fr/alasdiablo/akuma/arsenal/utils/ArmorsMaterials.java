package fr.alasdiablo.akuma.arsenal.utils;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

/**
 * List of all armor materials
 */
public enum ArmorsMaterials implements IArmorMaterial {

    BLACK_WOOL_ARMOR(Reference.BLACK_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    BLUE_WOOL_ARMOR(Reference.BLUE_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    BROWN_WOOL_ARMOR(Reference.BROWN_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    CYAN_WOOL_ARMOR(Reference.CYAN_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    GRAY_WOOL_ARMOR(Reference.GRAY_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    GREEN_WOOL_ARMOR(Reference.GREEN_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    LIGHT_BLUE_WOOL_ARMOR(Reference.LIGHT_BLUE_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    LIGHT_GRAY_WOOL_ARMOR(Reference.LIGHT_GRAY_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    LIME_WOOL_ARMOR(Reference.LIME_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    MAGENTA_WOOL_ARMOR(Reference.MAGENTA_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    ORANGE_WOOL_ARMOR(Reference.ORANGE_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    PINK_WOOL_ARMOR(Reference.PINK_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    PURPLE_WOOL_ARMOR(Reference.PURPLE_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    RED_WOOL_ARMOR(Reference.RED_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    WHITE_WOOL_ARMOR(Reference.WHITE_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f),
    YELLOW_WOOL_ARMOR(Reference.YELLOW_WOOL_ARMOR, 75, new int[] {1, 2, 3, 1} ,75, Ingredient.fromItems(Reference.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f);

    /**
     * name of the material
     */
    private String name;

    /**
     * durability of the material
     */
    private int[] durability;

    /**
     * damage reduction of the material
     */
    private int[] damageReductionAmount;

    /**
     * enchantability of the material
     */
    private int enchantability;

    /**
     * repair material(item use for repair the armor) of the material
     */
    private Ingredient repairMaterial;

    /**
     * sound(sound use on equipe) of the material
     */
    private SoundEvent soundEvent;

    /**
     * toughness of the material
     */
    private float toughness;

    /**
     * default constructor
     * @param name name of the material
     * @param durability durability of the material
     * @param damageReductionAmount damage reduction of the material
     * @param enchantability enchantability of the material
     * @param repairItem repair material(item use for repair the armor) of the material
     * @param soundEvent sound(sound use on equipe) of the material
     * @param toughness toughness of the material
     */
    ArmorsMaterials(String name, int durability, int[] damageReductionAmount, int enchantability, Ingredient repairItem, SoundEvent soundEvent, float toughness) {
        final int[] max_damge_arry = new int[] {13, 15, 16, 11};
        this.damageReductionAmount = damageReductionAmount;
        this.toughness = toughness;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.durability = new int[4];
        for (int i = 0; i < 4; i++) {
            this.durability[i] = max_damge_arry[i] * durability;
        }
        this.repairMaterial = repairItem;
        this.name = Reference.MOD_ID + ":" + name;
    }

    /**
     * use for get the durability
     * @param equipmentSlot select the armor piece (head, body, ...)
     * @return the value of the durability
     */
    @Override
    public int getDurability(EquipmentSlotType equipmentSlot) {
        return this.durability[equipmentSlot.getIndex()];
    }

    /**
     * use for get the damage reduction
     * @param equipmentSlot select the armor piece (head, body, ...)
     * @return returne the damage reduction
     */
    @Override
    public int getDamageReductionAmount(EquipmentSlotType equipmentSlot) {
        return this.damageReductionAmount[equipmentSlot.getIndex()];
    }

    /**
     * use for get the enchatability
     * @return the value of the enchatability
     */
    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    /**
     * use for get the equipe sound
     * @return the sound of the armor
     */
    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    /**
     * use for get the item use for repair the armor
     * @return an ingredient corresponding to the item
     */
    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial;
    }

    /**
     * use for get the name of the materials
     * @return the name of the materials
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * use for get the toughness
     * @return the toughness
     */
    @Override
    public float getToughness() {
        return this.toughness;
    }
}