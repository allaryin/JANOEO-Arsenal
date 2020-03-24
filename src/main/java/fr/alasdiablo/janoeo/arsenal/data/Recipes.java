package fr.alasdiablo.janoeo.arsenal.data;

import fr.alasdiablo.janoeo.arsenal.init.WoolsArmors;
import javafx.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Janoeo recipes data generator
 */
public class Recipes extends RecipeProvider {

    /**
     * constructor
     * @param generatorIn data generator instance
     */
    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    /**
     * load all recipes
     */
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        this.woolArmors(consumer);
    }

    private void woolArmors(Consumer<IFinishedRecipe> consumer) {
        Map<Pair<String, Block>, List<Pair<Item, List<String>>>> listOfArmor = new HashMap<>();
        listOfArmor.put(new Pair<>("has_black_wool", Blocks.BLACK_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.BLACK_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.BLACK_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.BLACK_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.BLACK_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_blue_wool", Blocks.BLUE_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.BLUE_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.BLUE_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.BLUE_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.BLUE_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_brown_wool", Blocks.BROWN_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.BROWN_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.BROWN_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.BROWN_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.BROWN_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_cyan_wool", Blocks.CYAN_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.CYAN_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.CYAN_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.CYAN_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.CYAN_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_gray_wool", Blocks.GRAY_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.GRAY_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.GRAY_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.GRAY_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.GRAY_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_green_wool", Blocks.GREEN_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.GREEN_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.GREEN_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.GREEN_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.GREEN_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_light_blue_wool", Blocks.LIGHT_BLUE_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.LIGHT_BLUE_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.LIGHT_BLUE_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.LIGHT_BLUE_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.LIGHT_BLUE_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_light_gray_wool", Blocks.LIGHT_GRAY_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.LIGHT_GRAY_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.LIGHT_GRAY_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.LIGHT_GRAY_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.LIGHT_GRAY_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_lime_wool", Blocks.LIME_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.LIME_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.LIME_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.LIME_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.LIME_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_magenta_wool", Blocks.MAGENTA_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.MAGENTA_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.MAGENTA_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.MAGENTA_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.MAGENTA_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_orange_wool", Blocks.ORANGE_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.ORANGE_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.ORANGE_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.ORANGE_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.ORANGE_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_pink_wool", Blocks.PINK_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.PINK_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.PINK_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.PINK_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.PINK_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_purple_wool", Blocks.PURPLE_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.PURPLE_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.PURPLE_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.PURPLE_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.PURPLE_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_red_wool", Blocks.RED_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.RED_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.RED_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.RED_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.RED_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_white_wool", Blocks.WHITE_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.WHITE_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.WHITE_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.WHITE_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.WHITE_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_yellow_wool", Blocks.YELLOW_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.YELLOW_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.YELLOW_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.YELLOW_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.YELLOW_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.forEach((key, values) -> values.forEach(element -> {
            ShapedRecipeBuilder recipe = ShapedRecipeBuilder.shapedRecipe(element.getKey()).key('W', key.getValue());
            element.getValue().forEach(recipe::patternLine);
            recipe.addCriterion(key.getKey(), this.hasItem(key.getValue())).build(consumer);
        }));
    }
}
