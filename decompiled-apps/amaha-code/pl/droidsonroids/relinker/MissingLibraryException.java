package pl.droidsonroids.relinker;

import java.util.Arrays;
import r1.b0;
/* loaded from: classes2.dex */
public class MissingLibraryException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MissingLibraryException(String str, String[] strArr, String[] strArr2) {
        super(b0.b(r3, Arrays.toString(strArr2), "."));
        StringBuilder g5 = d.g("Could not find '", str, "'. Looked for: ");
        g5.append(Arrays.toString(strArr));
        g5.append(", but only found: ");
    }
}
