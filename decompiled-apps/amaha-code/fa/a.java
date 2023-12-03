package fa;

import android.os.IInterface;
/* loaded from: classes.dex */
public interface a extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z10, int i6);

    int getIntFlagValue(String str, int i6, int i10);

    long getLongFlagValue(String str, long j10, int i6);

    String getStringFlagValue(String str, String str2, int i6);

    void init(da.a aVar);
}
