package u0;

import android.view.accessibility.AccessibilityRecord;
/* compiled from: AccessibilityRecordCompat.java */
/* loaded from: classes.dex */
public final class j {
    public static int a(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static int b(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    public static void c(AccessibilityRecord accessibilityRecord, int i6) {
        accessibilityRecord.setMaxScrollX(i6);
    }

    public static void d(AccessibilityRecord accessibilityRecord, int i6) {
        accessibilityRecord.setMaxScrollY(i6);
    }
}
