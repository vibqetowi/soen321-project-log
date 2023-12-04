package com.ifriend.infrastructure.audio.recording;

import android.content.Context;
import com.ifriend.domain.services.audio.recording.AudioRecordingFileStorage;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CacheAudioRecordingFileStorage.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/infrastructure/audio/recording/CacheAudioRecordingFileStorage;", "Lcom/ifriend/domain/services/audio/recording/AudioRecordingFileStorage;", "context", "Landroid/content/Context;", "fileExtension", "", "(Landroid/content/Context;Ljava/lang/String;)V", "dir", "Ljava/io/File;", "lastPath", "clear", "", "deleteLastFile", "generateFilePath", "getLastFilePath", "Companion", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheAudioRecordingFileStorage implements AudioRecordingFileStorage {
    public static final Companion Companion = new Companion(null);
    private static final String VOICE_TEMP_FILE_NAME = "MyVoice";
    private final File dir;
    private final String fileExtension;
    private String lastPath;

    public CacheAudioRecordingFileStorage(Context context, String fileExtension) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
        this.fileExtension = fileExtension;
        File file = new File(context.getCacheDir(), "recorded_audio");
        file.mkdirs();
        this.dir = file;
    }

    public /* synthetic */ CacheAudioRecordingFileStorage(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? ".mp4" : str);
    }

    /* compiled from: CacheAudioRecordingFileStorage.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/infrastructure/audio/recording/CacheAudioRecordingFileStorage$Companion;", "", "()V", "VOICE_TEMP_FILE_NAME", "", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.domain.services.audio.recording.AudioRecordingFileStorage
    public String getLastFilePath() {
        return this.lastPath;
    }

    @Override // com.ifriend.domain.services.audio.recording.AudioRecordingFileStorage
    public boolean deleteLastFile() {
        String str = this.lastPath;
        if (str == null) {
            return false;
        }
        this.lastPath = null;
        if (str.length() > 0) {
            File file = new File(str);
            if (file.exists()) {
                return file.delete();
            }
            return true;
        }
        return true;
    }

    @Override // com.ifriend.domain.services.audio.recording.AudioRecordingFileStorage
    public String generateFilePath() {
        this.dir.mkdirs();
        File file = this.dir;
        long currentTimeMillis = System.currentTimeMillis();
        String str = this.fileExtension;
        File file2 = new File(file, "MyVoice_" + currentTimeMillis + str);
        file2.createNewFile();
        String absolutePath = file2.getAbsolutePath();
        this.lastPath = absolutePath;
        Intrinsics.checkNotNull(absolutePath);
        return absolutePath;
    }

    @Override // com.ifriend.domain.services.audio.recording.AudioRecordingFileStorage
    public boolean clear() {
        return this.dir.delete();
    }
}
