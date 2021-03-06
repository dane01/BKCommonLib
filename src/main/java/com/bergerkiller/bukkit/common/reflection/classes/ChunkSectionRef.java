package com.bergerkiller.bukkit.common.reflection.classes;

import com.bergerkiller.bukkit.common.reflection.ClassTemplate;
import com.bergerkiller.bukkit.common.reflection.FieldAccessor;
import com.bergerkiller.bukkit.common.reflection.MethodAccessor;
import com.bergerkiller.bukkit.common.reflection.NMSClassTemplate;

public class ChunkSectionRef {
	public static final ClassTemplate<Object> TEMPLATE = new NMSClassTemplate("ChunkSection");
	public static final FieldAccessor<Object> skyLight = TEMPLATE.getField("skyLight");
	public static final FieldAccessor<Object> blockLight = TEMPLATE.getField("emittedLight");
	public static final MethodAccessor<Boolean> isEmpty = TEMPLATE.getMethod("isEmpty");
	public static final MethodAccessor<byte[]> getBlockIds = TEMPLATE.getMethod("getIdArray");
	public static final MethodAccessor<Object> getExtBlockIds = TEMPLATE.getMethod("getExtendedIdArray");
	public static final MethodAccessor<Object> getBlockData = TEMPLATE.getMethod("getDataArray");
	public static final MethodAccessor<Object> getBlockLightNibble = TEMPLATE.getMethod("getEmittedLightArray");
	public static final MethodAccessor<Object> getSkyLightNibble = TEMPLATE.getMethod("getSkyLightArray");
	private static final MethodAccessor<Integer> blocks = TEMPLATE.getMethod("getTypeId", int.class, int.class, int.class);
	private static final MethodAccessor<Void> blocksWithType = TEMPLATE.getMethod("setTypeId", int.class, int.class, int.class, int.class);
	private static final MethodAccessor<Integer> getData = TEMPLATE.getMethod("getData", int.class, int.class, int.class);
	private static final MethodAccessor<Void> setData = TEMPLATE.getMethod("setData", int.class, int.class, int.class, int.class);
	private static final MethodAccessor<Integer> getSkyLight = TEMPLATE.getMethod("getSkyLight", int.class, int.class, int.class);
	private static final MethodAccessor<Void> setSkyLight = TEMPLATE.getMethod("setSkyLight", int.class, int.class, int.class, int.class);
	private static final MethodAccessor<Integer> getBlockLight = TEMPLATE.getMethod("getEmittedLight", int.class, int.class, int.class);
	private static final MethodAccessor<Void> setBlockLight = TEMPLATE.getMethod("setEmittedLight", int.class, int.class, int.class, int.class);
		
	public static int getTypeId(Object section, int x, int y, int z) {
		return blocks.invoke(section, x & 0xf, y  & 0xf, z & 0xf);
	}

	public static void setTypeId(Object section, int x, int y, int z, int typeId) {
		blocksWithType.invoke(section, x & 0xf, y & 0xf, z & 0xf, typeId);
	}

	public static int getData(Object section, int x, int y, int z) {
		return getData.invoke(section, z & 0xf, y & 0xf, z & 0xf);
	}
	
	public static void setData(Object section, int x, int y, int z, int data) {
		setData.invoke(section, x & 0xf, y & 0xf, z & 0xf, data);
	}

	public static int getSkyLight(Object section, int x, int y, int z) {
		return getSkyLight.invoke(section, x & 0xf, y & 0xf, z & 0xf);
	}

	public static void setSkyLight(Object section, int x, int y, int z, int level) {
		setSkyLight.invoke(section, x & 0xf, y & 0xf, z & 0xf, level);
	}

	public static int getBlockLight(Object section, int x, int y, int z) {
		return getBlockLight.invoke(section,x & 0xf, y & 0xf, z & 0xf);
	}

	public static void setBlockLight(Object section, int x, int y, int z, int level) {
		setBlockLight.invoke(section, x & 0xf, y & 0xf, z & 0xf, level);
	}
}
