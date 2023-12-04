package io.sentry.android.core.internal.util;

import io.sentry.protocol.Device;
/* loaded from: classes4.dex */
public final class DeviceOrientations {
    private DeviceOrientations() {
    }

    public static Device.DeviceOrientation getOrientation(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return Device.DeviceOrientation.LANDSCAPE;
        }
        return Device.DeviceOrientation.PORTRAIT;
    }
}
