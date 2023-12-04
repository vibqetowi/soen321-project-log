package com.google.android.material.color;

import com.google.android.material.R;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class MaterialColorUtilitiesHelper {
    private static final Map<Integer, DynamicColor> colorResourceIdToColorValue;

    private MaterialColorUtilitiesHelper() {
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_primary), MaterialDynamicColors.primary);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_primary), MaterialDynamicColors.onPrimary);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_primary_inverse), MaterialDynamicColors.primaryInverse);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_primary_container), MaterialDynamicColors.primaryContainer);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_primary_container), MaterialDynamicColors.onPrimaryContainer);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_secondary), MaterialDynamicColors.secondary);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_secondary), MaterialDynamicColors.onSecondary);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_secondary_container), MaterialDynamicColors.secondaryContainer);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_secondary_container), MaterialDynamicColors.onSecondaryContainer);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_tertiary), MaterialDynamicColors.tertiary);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary), MaterialDynamicColors.onTertiary);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_tertiary_container), MaterialDynamicColors.tertiaryContainer);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary_container), MaterialDynamicColors.onTertiaryContainer);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_background), MaterialDynamicColors.background);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_background), MaterialDynamicColors.onBackground);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface), MaterialDynamicColors.surface);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_surface), MaterialDynamicColors.onSurface);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_variant), MaterialDynamicColors.surfaceVariant);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_surface_variant), MaterialDynamicColors.onSurfaceVariant);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_inverse), MaterialDynamicColors.surfaceInverse);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_surface_inverse), MaterialDynamicColors.onSurfaceInverse);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_bright), MaterialDynamicColors.surfaceBright);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_dim), MaterialDynamicColors.surfaceDim);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_container), MaterialDynamicColors.surfaceContainer);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_container_low), MaterialDynamicColors.surfaceSub1);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_container_high), MaterialDynamicColors.surfaceAdd1);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_container_lowest), MaterialDynamicColors.surfaceSub2);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_container_highest), MaterialDynamicColors.surfaceAdd2);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_outline), MaterialDynamicColors.outline);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_outline_variant), MaterialDynamicColors.outlineVariant);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_error), MaterialDynamicColors.error);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_error), MaterialDynamicColors.onError);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_error_container), MaterialDynamicColors.errorContainer);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_error_container), MaterialDynamicColors.onErrorContainer);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_control_activated), MaterialDynamicColors.controlActivated);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_control_normal), MaterialDynamicColors.controlNormal);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_control_highlight), MaterialDynamicColors.controlHighlight);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse), MaterialDynamicColors.textPrimaryInverse);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse), MaterialDynamicColors.textSecondaryAndTertiaryInverse);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse_disabled), MaterialDynamicColors.textSecondaryAndTertiaryInverseDisabled);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse_disable_only), MaterialDynamicColors.textPrimaryInverseDisableOnly);
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_text_hint_foreground_inverse), MaterialDynamicColors.textHintInverse);
        colorResourceIdToColorValue = Collections.unmodifiableMap(hashMap);
    }

    public static Map<Integer, Integer> createColorResourcesIdsToColorValues(DynamicScheme dynamicScheme) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, DynamicColor> entry : colorResourceIdToColorValue.entrySet()) {
            hashMap.put(entry.getKey(), Integer.valueOf(entry.getValue().getArgb(dynamicScheme)));
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
