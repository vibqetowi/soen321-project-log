package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFa1pSDK {
    final AFb1bSDK values;

    public AFa1pSDK() {
    }

    public AFa1pSDK(AFb1bSDK aFb1bSDK) {
        this.values = aFb1bSDK;
    }

    public static Map<String, Object> AFInAppEventType(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = AFKeystoreWrapper((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = AFInAppEventType((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    private static Object AFKeystoreWrapper(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj2 : (Collection) obj) {
                    jSONArray.put(AFKeystoreWrapper(obj2));
                }
                return jSONArray;
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i6 = 0; i6 < length; i6++) {
                    jSONArray2.put(AFKeystoreWrapper(Array.get(obj, i6)));
                }
                return jSONArray2;
            } else if (obj instanceof Map) {
                return values((Map) obj);
            } else {
                return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static JSONObject values(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), AFKeystoreWrapper(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AFInAppEventParameterName(AFa1dSDK aFa1dSDK) {
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            File file = new File(this.values.values.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return null;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 40) {
                AFLogger.afInfoLog("CACHE: reached cache limit, not caching request");
                return null;
            }
            StringBuilder sb2 = new StringBuilder("CACHE: caching request with URL: ");
            sb2.append(aFa1dSDK.values);
            AFLogger.afInfoLog(sb2.toString());
            String l2 = Long.toString(System.currentTimeMillis());
            File file2 = new File(new File(this.values.values.getFilesDir(), "AFRequestCache"), l2);
            file2.createNewFile();
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2.getPath(), true));
            try {
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFa1dSDK.AFKeystoreWrapper);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFa1dSDK.values);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFa1dSDK.AFInAppEventParameterName(), 2));
                    outputStreamWriter.write(10);
                    AFc1kSDK aFc1kSDK = aFa1dSDK.AFInAppEventType;
                    if (aFc1kSDK != null) {
                        outputStreamWriter.write("type=");
                        outputStreamWriter.write(aFc1kSDK.name());
                        outputStreamWriter.write(10);
                    }
                    outputStreamWriter.flush();
                    AFLogger.afInfoLog("CACHE: done, cacheKey: ".concat(String.valueOf(l2)));
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e10) {
                        AFLogger.afErrorLog(e10);
                    }
                    return l2;
                } catch (Exception e11) {
                    e = e11;
                    AFLogger.afErrorLog("CACHE: Could not cache request", e);
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e12) {
                            AFLogger.afErrorLog(e12);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter2 = outputStreamWriter;
                if (outputStreamWriter2 != null) {
                    try {
                        outputStreamWriter2.close();
                    } catch (IOException e13) {
                        AFLogger.afErrorLog(e13);
                    }
                }
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            outputStreamWriter = null;
        } catch (Throwable th3) {
            th = th3;
            if (outputStreamWriter2 != null) {
            }
            throw th;
        }
    }

    public final List<AFa1dSDK> valueOf() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.values.values.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            listFiles = file.listFiles();
        } catch (Exception e10) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e10);
        }
        if (listFiles == null) {
            return arrayList;
        }
        for (File file2 : listFiles) {
            StringBuilder sb2 = new StringBuilder("CACHE: Found cached request");
            sb2.append(file2.getName());
            AFLogger.afInfoLog(sb2.toString());
            arrayList.add(values(file2));
        }
        return arrayList;
    }

    public static AFe1zSDK values(Context context) {
        if (context instanceof Activity) {
            return AFe1zSDK.activity;
        }
        if (context instanceof Application) {
            return AFe1zSDK.application;
        }
        return AFe1zSDK.other;
    }

    private static AFa1dSDK values(File file) {
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                char[] cArr = new char[(int) file.length()];
                fileReader.read(cArr);
                AFa1dSDK aFa1dSDK = new AFa1dSDK(cArr);
                aFa1dSDK.AFInAppEventParameterName = file.getName();
                try {
                    fileReader.close();
                } catch (IOException e10) {
                    AFLogger.afErrorLog(e10);
                }
                return aFa1dSDK;
            } catch (Exception unused) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e11) {
                        AFLogger.afErrorLog(e11);
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileReader2 = fileReader;
                if (fileReader2 != null) {
                    try {
                        fileReader2.close();
                    } catch (IOException e12) {
                        AFLogger.afErrorLog(e12);
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            fileReader = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static List<Object> AFKeystoreWrapper(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            Object obj = jSONArray.get(i6);
            if (obj instanceof JSONArray) {
                obj = AFKeystoreWrapper((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = AFInAppEventType((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final boolean AFInAppEventParameterName(String str) {
        File file = new File(new File(this.values.values.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb2 = new StringBuilder("CACHE: Deleting ");
        sb2.append(str);
        sb2.append(" from cache");
        AFLogger.afInfoLog(sb2.toString());
        if (file.exists()) {
            try {
                return file.delete();
            } catch (Exception e10) {
                StringBuilder sb3 = new StringBuilder("CACHE: Could not delete ");
                sb3.append(str);
                sb3.append(" from cache");
                AFLogger.afErrorLog(sb3.toString(), e10);
                return false;
            }
        }
        return true;
    }
}
