package com.bergerkiller.bukkit.common.conversion.type;

import java.util.List;
import java.util.Set;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;

import com.bergerkiller.bukkit.common.nbt.CommonTag;
import com.bergerkiller.bukkit.common.wrappers.DataWatcher;

public class ConversionTypes {
	// Arrays
	public static final ObjectArrayConverter<Object[]> toObjectArr = ObjectArrayConverter.toObjectArr;
	public static final PrimitiveArrayConverter<boolean[]> toBoolArr = PrimitiveArrayConverter.toBoolArr;
	public static final PrimitiveArrayConverter<char[]> toCharArr = PrimitiveArrayConverter.toCharArr;
	public static final PrimitiveArrayConverter<byte[]> toByteArr = PrimitiveArrayConverter.toByteArr;
	public static final PrimitiveArrayConverter<short[]> toShortArr = PrimitiveArrayConverter.toShortArr;
	public static final PrimitiveArrayConverter<int[]> toIntArr = PrimitiveArrayConverter.toIntArr;
	public static final PrimitiveArrayConverter<long[]> toLongArr = PrimitiveArrayConverter.toLongArr;
	public static final PrimitiveArrayConverter<float[]> toFloatArr = PrimitiveArrayConverter.toFloatArr;
	public static final PrimitiveArrayConverter<double[]> toDoubleArr = PrimitiveArrayConverter.toDoubleArr;
	// Collections
	public static final CollectionConverter<List<?>> toList = CollectionConverter.toList;
	public static final CollectionConverter<Set<?>> toSet = CollectionConverter.toSet;
	// Primitives
	public static final PrimitiveConverter<String> toString = PrimitiveConverter.toString;
	public static final PrimitiveConverter<Byte> toByte = PrimitiveConverter.toByte;
	public static final PrimitiveConverter<Short> toShort = PrimitiveConverter.toShort;
	public static final PrimitiveConverter<Integer> toInt = PrimitiveConverter.toInt;
	public static final PrimitiveConverter<Long> toLong = PrimitiveConverter.toLong;
	public static final PrimitiveConverter<Float> toFloat = PrimitiveConverter.toFloat;
	public static final PrimitiveConverter<Double> toDouble = PrimitiveConverter.toDouble;
	public static final PrimitiveConverter<Boolean> toBool = PrimitiveConverter.toBool;
	public static final PrimitiveConverter<Character> toChar = PrimitiveConverter.toChar;
	// Handles
	public static final HandleConverter toEntityHandle = HandleConverter.toEntityHandle;
	public static final HandleConverter toWorldHandle = HandleConverter.toWorldHandle;
	public static final HandleConverter toChunkHandle = HandleConverter.toChunkHandle;
	public static final HandleConverter toItemStackHandle = HandleConverter.toItemStackHandle;
	public static final HandleConverter toItemHandle = HandleConverter.toItemHandle;
	public static final HandleConverter toTileEntityHandle = HandleConverter.toTileEntityHandle;
	public static final HandleConverter toInventoryHandle = HandleConverter.toInventoryHandle;
	public static final HandleConverter toDataWatcherHandle = HandleConverter.toDataWatcherHandle;
	public static final HandleConverter toNBTTagHandle = HandleConverter.toNBTTagHandle;
	public static final HandleConverter toBlockHandle = HandleConverter.toBlockHandle;
	// Wrappers
	public static final WrapperConverter<Entity> toEntity = WrapperConverter.toEntity;
	public static final WrapperConverter<World> toWorld = WrapperConverter.toWorld;
	public static final WrapperConverter<Chunk> toChunk = WrapperConverter.toChunk;
	public static final WrapperConverter<Block> toBlock = WrapperConverter.toBlock;
	public static final WrapperConverter<BlockState> toBlockState = WrapperConverter.toBlockState;
	public static final WrapperConverter<CommonTag> toCommonTag = WrapperConverter.toCommonTag;
	public static final WrapperConverter<DataWatcher> toDataWatcher = WrapperConverter.toDataWatcher;
	// Properties
	public static final PropertyConverter<Integer> toItemId = PropertyConverter.toItemId;
	public static final PropertyConverter<Material> toItemMaterial = PropertyConverter.toItemMaterial;
}