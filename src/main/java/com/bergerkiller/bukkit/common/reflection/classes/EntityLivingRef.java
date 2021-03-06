package com.bergerkiller.bukkit.common.reflection.classes;

import com.bergerkiller.bukkit.common.reflection.ClassTemplate;
import com.bergerkiller.bukkit.common.reflection.FieldAccessor;
import com.bergerkiller.bukkit.common.reflection.MethodAccessor;
import com.bergerkiller.bukkit.common.reflection.SafeMethod;

import com.bergerkiller.bukkit.common.reflection.NMSClassTemplate;
import com.bergerkiller.bukkit.common.utils.CommonUtil;

public class EntityLivingRef extends EntityRef {
	public static final ClassTemplate<?> TEMPLATE = NMSClassTemplate.create("EntityLiving");
	public static final FieldAccessor<Object> attributeMap = TEMPLATE.getField("d");
	public static final MethodAccessor<Void> resetAttributes = TEMPLATE.getMethod("az");
	public static final MethodAccessor<Object> getAttributesMap = TEMPLATE.getMethod("aX");
	public static final MethodAccessor<Object> getNavigation = new SafeMethod<Object>(CommonUtil.getNMSClass("EntityInsentient"), "getNavigation");
}
