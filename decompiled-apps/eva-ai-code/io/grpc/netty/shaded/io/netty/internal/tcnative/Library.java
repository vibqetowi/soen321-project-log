package io.grpc.netty.shaded.io.netty.internal.tcnative;

import java.io.File;
import org.apache.commons.lang3.ClassUtils;
/* loaded from: classes4.dex */
public final class Library {
    private static final String PROVIDED = "provided";
    private static final String[] NAMES = {"netty_tcnative", "libnetty_tcnative"};
    private static Library _instance = null;

    private static native boolean aprHasThreads();

    private static native int aprMajorVersion();

    private static native String aprVersionString();

    private static native boolean initialize0();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r4 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
        throw new java.lang.UnsatisfiedLinkError(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Library() throws Exception {
        String[] split = System.getProperty("java.library.path").split(File.pathSeparator);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (true) {
            String[] strArr = NAMES;
            if (i >= strArr.length) {
                break;
            }
            try {
                loadLibrary(strArr[i]);
                z = true;
            } catch (ThreadDeath e) {
                throw e;
            } catch (VirtualMachineError e2) {
                throw e2;
            } catch (Throwable th) {
                String mapLibraryName = System.mapLibraryName(NAMES[i]);
                for (String str : split) {
                    if (new File(str, mapLibraryName).exists()) {
                        throw new RuntimeException(th);
                    }
                }
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(th.getMessage());
            }
            if (z) {
                break;
            }
            i++;
        }
    }

    private Library(String str) {
        if (PROVIDED.equals(str)) {
            return;
        }
        loadLibrary(str);
    }

    private static void loadLibrary(String str) {
        System.loadLibrary(calculatePackagePrefix().replace(ClassUtils.PACKAGE_SEPARATOR_CHAR, '_') + str);
    }

    private static String calculatePackagePrefix() {
        String name = Library.class.getName();
        String replace = "io!netty!internal!tcnative!Library".replace('!', (char) ClassUtils.PACKAGE_SEPARATOR_CHAR);
        if (!name.endsWith(replace)) {
            throw new UnsatisfiedLinkError(String.format("Could not find prefix added to %s to get %s. When shading, only adding a package prefix is supported", replace, name));
        }
        return name.substring(0, name.length() - replace.length());
    }

    public static boolean initialize() throws Exception {
        return initialize(PROVIDED, null);
    }

    public static boolean initialize(String str, String str2) throws Exception {
        if (_instance == null) {
            _instance = str == null ? new Library() : new Library(str);
            if (aprMajorVersion() < 1) {
                throw new UnsatisfiedLinkError("Unsupported APR Version (" + aprVersionString() + ")");
            } else if (!aprHasThreads()) {
                throw new UnsatisfiedLinkError("Missing APR_HAS_THREADS");
            }
        }
        return initialize0() && SSL.initialize(str2) == 0;
    }
}
