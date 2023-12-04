package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes7.dex */
public class DevelopmentPlatformProvider {
    private static final String FLUTTER_ASSET_FILE = "flutter_assets/NOTICES.Z";
    private static final String FLUTTER_PLATFORM = "Flutter";
    private static final String UNITY_PLATFORM = "Unity";
    private static final String UNITY_VERSION_FIELD = "com.google.firebase.crashlytics.unity_version";
    private final Context context;
    private DevelopmentPlatform developmentPlatform = null;

    public DevelopmentPlatformProvider(Context context) {
        this.context = context;
    }

    public String getDevelopmentPlatform() {
        return initDevelopmentPlatform().developmentPlatform;
    }

    public String getDevelopmentPlatformVersion() {
        return initDevelopmentPlatform().developmentPlatformVersion;
    }

    public static boolean isUnity(Context context) {
        return CommonUtils.getResourcesIdentifier(context, UNITY_VERSION_FIELD, TypedValues.Custom.S_STRING) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean assetFileExists(String str) {
        if (this.context.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.context.getAssets().open(str);
            if (open != null) {
                open.close();
                return true;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private DevelopmentPlatform initDevelopmentPlatform() {
        if (this.developmentPlatform == null) {
            this.developmentPlatform = new DevelopmentPlatform();
        }
        return this.developmentPlatform;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public class DevelopmentPlatform {
        private final String developmentPlatform;
        private final String developmentPlatformVersion;

        private DevelopmentPlatform() {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.this.context, DevelopmentPlatformProvider.UNITY_VERSION_FIELD, TypedValues.Custom.S_STRING);
            if (resourcesIdentifier == 0) {
                if (DevelopmentPlatformProvider.this.assetFileExists(DevelopmentPlatformProvider.FLUTTER_ASSET_FILE)) {
                    this.developmentPlatform = DevelopmentPlatformProvider.FLUTTER_PLATFORM;
                    this.developmentPlatformVersion = null;
                    Logger.getLogger().v("Development platform is: Flutter");
                    return;
                }
                this.developmentPlatform = null;
                this.developmentPlatformVersion = null;
                return;
            }
            this.developmentPlatform = DevelopmentPlatformProvider.UNITY_PLATFORM;
            String string = DevelopmentPlatformProvider.this.context.getResources().getString(resourcesIdentifier);
            this.developmentPlatformVersion = string;
            Logger logger = Logger.getLogger();
            logger.v("Unity Editor version is: " + string);
        }
    }
}
