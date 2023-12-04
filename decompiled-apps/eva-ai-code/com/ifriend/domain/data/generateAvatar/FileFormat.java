package com.ifriend.domain.data.generateAvatar;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvatarsStorage.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/data/generateAvatar/FileFormat;", "", "(Ljava/lang/String;I)V", "makePath", "", ClientCookie.PATH_ATTR, "PNG", "MP4", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FileFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FileFormat[] $VALUES;
    public static final FileFormat PNG = new FileFormat("PNG", 0);
    public static final FileFormat MP4 = new FileFormat("MP4", 1);

    /* compiled from: AvatarsStorage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FileFormat.values().length];
            try {
                iArr[FileFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FileFormat.MP4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ FileFormat[] $values() {
        return new FileFormat[]{PNG, MP4};
    }

    public static EnumEntries<FileFormat> getEntries() {
        return $ENTRIES;
    }

    public static FileFormat valueOf(String str) {
        return (FileFormat) Enum.valueOf(FileFormat.class, str);
    }

    public static FileFormat[] values() {
        return (FileFormat[]) $VALUES.clone();
    }

    private FileFormat(String str, int i) {
    }

    static {
        FileFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final String makePath(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return path + ".png";
        } else if (i == 2) {
            return path + ".mp4";
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
