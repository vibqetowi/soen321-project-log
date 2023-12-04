package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class l {
    final be AFKeystoreWrapper;

    /* loaded from: classes2.dex */
    public interface d {
        void valueOf(String str, String str2, String str3);

        void values(String str);
    }

    l() {
    }

    public l(be beVar) {
        this.AFKeystoreWrapper = beVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AFInAppEventParameterName(n nVar) {
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            File file = new File(this.AFKeystoreWrapper.values.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return null;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 40) {
                AFLogger.values("CACHE: reached cache limit, not caching request");
                return null;
            }
            StringBuilder sb = new StringBuilder("CACHE: caching request with URL: ");
            sb.append(nVar.valueOf);
            AFLogger.values(sb.toString());
            String l = Long.toString(System.currentTimeMillis());
            File file2 = new File(new File(this.AFKeystoreWrapper.values.getFilesDir(), "AFRequestCache"), l);
            file2.createNewFile();
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2.getPath(), true));
            try {
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(nVar.AFInAppEventType);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(nVar.valueOf);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(nVar.AFInAppEventParameterName(), 2));
                    outputStreamWriter.write(10);
                    bt btVar = nVar.AFKeystoreWrapper;
                    if (btVar != null) {
                        outputStreamWriter.write("type=");
                        outputStreamWriter.write(btVar.name());
                        outputStreamWriter.write(10);
                    }
                    outputStreamWriter.flush();
                    AFLogger.values("CACHE: done, cacheKey: ".concat(String.valueOf(l)));
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e) {
                        AFLogger.values(e);
                    }
                    return l;
                } catch (Exception e2) {
                    e = e2;
                    AFLogger.valueOf("CACHE: Could not cache request", e);
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e3) {
                            AFLogger.values(e3);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                outputStreamWriter2 = outputStreamWriter;
                if (outputStreamWriter2 != null) {
                    try {
                        outputStreamWriter2.close();
                    } catch (IOException e4) {
                        AFLogger.values(e4);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            outputStreamWriter = null;
        } catch (Throwable th2) {
            th = th2;
            if (outputStreamWriter2 != null) {
            }
            throw th;
        }
    }

    public final List<n> AFInAppEventType() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.AFKeystoreWrapper.values.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            listFiles = file.listFiles();
        } catch (Exception e) {
            AFLogger.valueOf("CACHE: Could not get cached requests", e);
        }
        if (listFiles == null) {
            return arrayList;
        }
        for (File file2 : listFiles) {
            StringBuilder sb = new StringBuilder("CACHE: Found cached request");
            sb.append(file2.getName());
            AFLogger.values(sb.toString());
            arrayList.add(values(file2));
        }
        return arrayList;
    }

    private static n values(File file) {
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                char[] cArr = new char[(int) file.length()];
                fileReader.read(cArr);
                n nVar = new n(cArr);
                nVar.AFInAppEventParameterName = file.getName();
                try {
                    fileReader.close();
                } catch (IOException e) {
                    AFLogger.values(e);
                }
                return nVar;
            } catch (Exception unused) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e2) {
                        AFLogger.values(e2);
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileReader2 = fileReader;
                if (fileReader2 != null) {
                    try {
                        fileReader2.close();
                    } catch (IOException e3) {
                        AFLogger.values(e3);
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean valueOf(String str) {
        File file = new File(new File(this.AFKeystoreWrapper.values.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("CACHE: Deleting ");
        sb.append(str);
        sb.append(" from cache");
        AFLogger.values(sb.toString());
        if (file.exists()) {
            try {
                return file.delete();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("CACHE: Could not delete ");
                sb2.append(str);
                sb2.append(" from cache");
                AFLogger.valueOf(sb2.toString(), e);
                return false;
            }
        }
        return true;
    }
}
