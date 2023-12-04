package org.conscrypt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.codec.language.Soundex;
import org.conscrypt.NativeLibraryLoader;
/* loaded from: classes5.dex */
final class NativeCryptoJni {
    private static final String DYNAMIC_LIB_NAME_PREFIX = "conscrypt_openjdk_jni";
    private static final String STATIC_LIB_NAME = "conscrypt";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void init() throws UnsatisfiedLinkError {
        ArrayList arrayList = new ArrayList();
        if (NativeLibraryLoader.loadFirstAvailable(classLoader(), arrayList, platformLibName(), DYNAMIC_LIB_NAME_PREFIX, STATIC_LIB_NAME)) {
            return;
        }
        logResults(arrayList);
        throwBestError(arrayList);
    }

    private NativeCryptoJni() {
    }

    private static void logResults(List<NativeLibraryLoader.LoadResult> list) {
        for (NativeLibraryLoader.LoadResult loadResult : list) {
            loadResult.log();
        }
    }

    private static void throwBestError(List<NativeLibraryLoader.LoadResult> list) {
        Collections.sort(list, ErrorComparator.INSTANCE);
        Throwable th = list.get(0).error;
        for (NativeLibraryLoader.LoadResult loadResult : list.subList(1, list.size())) {
            th.addSuppressed(loadResult.error);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw ((Error) new UnsatisfiedLinkError(th.getMessage()).initCause(th));
    }

    private static ClassLoader classLoader() {
        return NativeCrypto.class.getClassLoader();
    }

    private static String platformLibName() {
        return "conscrypt_openjdk_jni-" + osName() + Soundex.SILENT_MARKER + archName();
    }

    private static String osName() {
        return HostProperties.OS.getFileComponent();
    }

    private static String archName() {
        return HostProperties.ARCH.getFileComponent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class ErrorComparator implements Comparator<NativeLibraryLoader.LoadResult> {
        static final ErrorComparator INSTANCE = new ErrorComparator();

        private ErrorComparator() {
        }

        @Override // java.util.Comparator
        public int compare(NativeLibraryLoader.LoadResult loadResult, NativeLibraryLoader.LoadResult loadResult2) {
            Throwable th = loadResult.error;
            Throwable th2 = loadResult2.error;
            boolean z = th instanceof UnsatisfiedLinkError;
            boolean z2 = th2 instanceof UnsatisfiedLinkError;
            if (z != z2) {
                return (z2 ? 1 : 0) - (z ? 1 : 0);
            }
            String message = th.getMessage();
            String message2 = th2.getMessage();
            int i = 0;
            int i2 = (message == null || !message.contains("java.library.path")) ? 1 : 0;
            if (message2 == null || !message2.contains("java.library.path")) {
                i = 1;
            }
            return i - i2;
        }
    }
}
