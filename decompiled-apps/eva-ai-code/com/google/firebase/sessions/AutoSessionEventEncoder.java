package com.google.firebase.sessions;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.domain.config.ConfigKeys;
import java.io.IOException;
/* loaded from: classes7.dex */
public final class AutoSessionEventEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoSessionEventEncoder();

    private AutoSessionEventEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(SessionEvent.class, SessionEventEncoder.INSTANCE);
        encoderConfig.registerEncoder(SessionInfo.class, SessionInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(DataCollectionStatus.class, DataCollectionStatusEncoder.INSTANCE);
        encoderConfig.registerEncoder(ApplicationInfo.class, ApplicationInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(AndroidApplicationInfo.class, AndroidApplicationInfoEncoder.INSTANCE);
    }

    /* loaded from: classes7.dex */
    private static final class SessionEventEncoder implements ObjectEncoder<SessionEvent> {
        static final SessionEventEncoder INSTANCE = new SessionEventEncoder();
        private static final FieldDescriptor EVENTTYPE_DESCRIPTOR = FieldDescriptor.of("eventType");
        private static final FieldDescriptor SESSIONDATA_DESCRIPTOR = FieldDescriptor.of("sessionData");
        private static final FieldDescriptor APPLICATIONINFO_DESCRIPTOR = FieldDescriptor.of("applicationInfo");

        private SessionEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(SessionEvent sessionEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(EVENTTYPE_DESCRIPTOR, sessionEvent.getEventType());
            objectEncoderContext.add(SESSIONDATA_DESCRIPTOR, sessionEvent.getSessionData());
            objectEncoderContext.add(APPLICATIONINFO_DESCRIPTOR, sessionEvent.getApplicationInfo());
        }
    }

    /* loaded from: classes7.dex */
    private static final class SessionInfoEncoder implements ObjectEncoder<SessionInfo> {
        static final SessionInfoEncoder INSTANCE = new SessionInfoEncoder();
        private static final FieldDescriptor SESSIONID_DESCRIPTOR = FieldDescriptor.of("sessionId");
        private static final FieldDescriptor FIRSTSESSIONID_DESCRIPTOR = FieldDescriptor.of("firstSessionId");
        private static final FieldDescriptor SESSIONINDEX_DESCRIPTOR = FieldDescriptor.of("sessionIndex");
        private static final FieldDescriptor EVENTTIMESTAMPUS_DESCRIPTOR = FieldDescriptor.of("eventTimestampUs");
        private static final FieldDescriptor DATACOLLECTIONSTATUS_DESCRIPTOR = FieldDescriptor.of("dataCollectionStatus");
        private static final FieldDescriptor FIREBASEINSTALLATIONID_DESCRIPTOR = FieldDescriptor.of("firebaseInstallationId");

        private SessionInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(SessionInfo sessionInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(SESSIONID_DESCRIPTOR, sessionInfo.getSessionId());
            objectEncoderContext.add(FIRSTSESSIONID_DESCRIPTOR, sessionInfo.getFirstSessionId());
            objectEncoderContext.add(SESSIONINDEX_DESCRIPTOR, sessionInfo.getSessionIndex());
            objectEncoderContext.add(EVENTTIMESTAMPUS_DESCRIPTOR, sessionInfo.getEventTimestampUs());
            objectEncoderContext.add(DATACOLLECTIONSTATUS_DESCRIPTOR, sessionInfo.getDataCollectionStatus());
            objectEncoderContext.add(FIREBASEINSTALLATIONID_DESCRIPTOR, sessionInfo.getFirebaseInstallationId());
        }
    }

    /* loaded from: classes7.dex */
    private static final class DataCollectionStatusEncoder implements ObjectEncoder<DataCollectionStatus> {
        static final DataCollectionStatusEncoder INSTANCE = new DataCollectionStatusEncoder();
        private static final FieldDescriptor PERFORMANCE_DESCRIPTOR = FieldDescriptor.of("performance");
        private static final FieldDescriptor CRASHLYTICS_DESCRIPTOR = FieldDescriptor.of("crashlytics");
        private static final FieldDescriptor SESSIONSAMPLINGRATE_DESCRIPTOR = FieldDescriptor.of("sessionSamplingRate");

        private DataCollectionStatusEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(DataCollectionStatus dataCollectionStatus, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PERFORMANCE_DESCRIPTOR, dataCollectionStatus.getPerformance());
            objectEncoderContext.add(CRASHLYTICS_DESCRIPTOR, dataCollectionStatus.getCrashlytics());
            objectEncoderContext.add(SESSIONSAMPLINGRATE_DESCRIPTOR, dataCollectionStatus.getSessionSamplingRate());
        }
    }

    /* loaded from: classes7.dex */
    private static final class ApplicationInfoEncoder implements ObjectEncoder<ApplicationInfo> {
        static final ApplicationInfoEncoder INSTANCE = new ApplicationInfoEncoder();
        private static final FieldDescriptor APPID_DESCRIPTOR = FieldDescriptor.of("appId");
        private static final FieldDescriptor DEVICEMODEL_DESCRIPTOR = FieldDescriptor.of(ConfigKeys.DEVICE_MODEL);
        private static final FieldDescriptor SESSIONSDKVERSION_DESCRIPTOR = FieldDescriptor.of("sessionSdkVersion");
        private static final FieldDescriptor OSVERSION_DESCRIPTOR = FieldDescriptor.of("osVersion");
        private static final FieldDescriptor LOGENVIRONMENT_DESCRIPTOR = FieldDescriptor.of("logEnvironment");
        private static final FieldDescriptor ANDROIDAPPINFO_DESCRIPTOR = FieldDescriptor.of("androidAppInfo");

        private ApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ApplicationInfo applicationInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(APPID_DESCRIPTOR, applicationInfo.getAppId());
            objectEncoderContext.add(DEVICEMODEL_DESCRIPTOR, applicationInfo.getDeviceModel());
            objectEncoderContext.add(SESSIONSDKVERSION_DESCRIPTOR, applicationInfo.getSessionSdkVersion());
            objectEncoderContext.add(OSVERSION_DESCRIPTOR, applicationInfo.getOsVersion());
            objectEncoderContext.add(LOGENVIRONMENT_DESCRIPTOR, applicationInfo.getLogEnvironment());
            objectEncoderContext.add(ANDROIDAPPINFO_DESCRIPTOR, applicationInfo.getAndroidAppInfo());
        }
    }

    /* loaded from: classes7.dex */
    private static final class AndroidApplicationInfoEncoder implements ObjectEncoder<AndroidApplicationInfo> {
        static final AndroidApplicationInfoEncoder INSTANCE = new AndroidApplicationInfoEncoder();
        private static final FieldDescriptor PACKAGENAME_DESCRIPTOR = FieldDescriptor.of(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        private static final FieldDescriptor VERSIONNAME_DESCRIPTOR = FieldDescriptor.of("versionName");
        private static final FieldDescriptor APPBUILDVERSION_DESCRIPTOR = FieldDescriptor.of("appBuildVersion");
        private static final FieldDescriptor DEVICEMANUFACTURER_DESCRIPTOR = FieldDescriptor.of("deviceManufacturer");

        private AndroidApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(AndroidApplicationInfo androidApplicationInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PACKAGENAME_DESCRIPTOR, androidApplicationInfo.getPackageName());
            objectEncoderContext.add(VERSIONNAME_DESCRIPTOR, androidApplicationInfo.getVersionName());
            objectEncoderContext.add(APPBUILDVERSION_DESCRIPTOR, androidApplicationInfo.getAppBuildVersion());
            objectEncoderContext.add(DEVICEMANUFACTURER_DESCRIPTOR, androidApplicationInfo.getDeviceManufacturer());
        }
    }
}
