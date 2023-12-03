package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: Data.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final String f3234b = q.f("Data");

    /* renamed from: c  reason: collision with root package name */
    public static final d f3235c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f3236a;

    /* compiled from: Data.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f3237a = new HashMap();

        public final void a(HashMap hashMap) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                HashMap hashMap2 = this.f3237a;
                if (value == null) {
                    hashMap2.put(str, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                        int i6 = 0;
                        if (cls == boolean[].class) {
                            boolean[] zArr = (boolean[]) value;
                            String str2 = d.f3234b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i6 < zArr.length) {
                                boolArr[i6] = Boolean.valueOf(zArr[i6]);
                                i6++;
                            }
                            hashMap2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            byte[] bArr = (byte[]) value;
                            String str3 = d.f3234b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i6 < bArr.length) {
                                bArr2[i6] = Byte.valueOf(bArr[i6]);
                                i6++;
                            }
                            hashMap2.put(str, bArr2);
                        } else if (cls == int[].class) {
                            int[] iArr = (int[]) value;
                            String str4 = d.f3234b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i6 < iArr.length) {
                                numArr[i6] = Integer.valueOf(iArr[i6]);
                                i6++;
                            }
                            hashMap2.put(str, numArr);
                        } else if (cls == long[].class) {
                            long[] jArr = (long[]) value;
                            String str5 = d.f3234b;
                            Long[] lArr = new Long[jArr.length];
                            while (i6 < jArr.length) {
                                lArr[i6] = Long.valueOf(jArr[i6]);
                                i6++;
                            }
                            hashMap2.put(str, lArr);
                        } else if (cls == float[].class) {
                            float[] fArr = (float[]) value;
                            String str6 = d.f3234b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i6 < fArr.length) {
                                fArr2[i6] = Float.valueOf(fArr[i6]);
                                i6++;
                            }
                            hashMap2.put(str, fArr2);
                        } else if (cls == double[].class) {
                            double[] dArr = (double[]) value;
                            String str7 = d.f3234b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i6 < dArr.length) {
                                dArr2[i6] = Double.valueOf(dArr[i6]);
                                i6++;
                            }
                            hashMap2.put(str, dArr2);
                        } else {
                            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                        }
                    } else {
                        hashMap2.put(str, value);
                    }
                }
            }
        }
    }

    static {
        d dVar = new d(new HashMap());
        b(dVar);
        f3235c = dVar;
    }

    public d() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(7:4|5|6|7|(2:9|10)|12|13)|14|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
        android.util.Log.e(r1, "Error in Data#fromByteArray: ", r8);
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0060: MOVE  (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:38:0x005f */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable e10;
        ObjectInputStream objectInputStream2;
        String str = f3234b;
        if (bArr.length <= 10240) {
            HashMap hashMap = new HashMap();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream3 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                            hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e11) {
                            Log.e(str, "Error in Data#fromByteArray: ", e11);
                        }
                    } catch (IOException e12) {
                        e10 = e12;
                        Log.e(str, "Error in Data#fromByteArray: ", e10);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e13) {
                                Log.e(str, "Error in Data#fromByteArray: ", e13);
                            }
                        }
                        byteArrayInputStream.close();
                        return new d(hashMap);
                    } catch (ClassNotFoundException e14) {
                        e10 = e14;
                        Log.e(str, "Error in Data#fromByteArray: ", e10);
                        if (objectInputStream != null) {
                        }
                        byteArrayInputStream.close();
                        return new d(hashMap);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream3 = objectInputStream2;
                    if (objectInputStream3 != null) {
                        try {
                            objectInputStream3.close();
                        } catch (IOException e15) {
                            Log.e(str, "Error in Data#fromByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e16) {
                        Log.e(str, "Error in Data#fromByteArray: ", e16);
                    }
                    throw th;
                }
            } catch (IOException e17) {
                e = e17;
                Throwable th3 = e;
                objectInputStream = null;
                e10 = th3;
                Log.e(str, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new d(hashMap);
            } catch (ClassNotFoundException e18) {
                e = e18;
                Throwable th32 = e;
                objectInputStream = null;
                e10 = th32;
                Log.e(str, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new d(hashMap);
            } catch (Throwable th4) {
                th = th4;
                if (objectInputStream3 != null) {
                }
                byteArrayInputStream.close();
                throw th;
            }
            byteArrayInputStream.close();
            return new d(hashMap);
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    public static byte[] b(d dVar) {
        ObjectOutputStream objectOutputStream;
        String str = f3234b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = null;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            objectOutputStream.writeInt(dVar.f3236a.size());
            for (Map.Entry entry : dVar.f3236a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e11) {
                Log.e(str, "Error in Data#toByteArray: ", e11);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                Log.e(str, "Error in Data#toByteArray: ", e12);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e13) {
            e = e13;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e14) {
                    Log.e(str, "Error in Data#toByteArray: ", e14);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e15) {
                Log.e(str, "Error in Data#toByteArray: ", e15);
            }
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e16) {
                    Log.e(str, "Error in Data#toByteArray: ", e16);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e17) {
                Log.e(str, "Error in Data#toByteArray: ", e17);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        HashMap hashMap = this.f3236a;
        Set<String> keySet = hashMap.keySet();
        if (!keySet.equals(dVar.f3236a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = hashMap.get(str);
            Object obj3 = dVar.f3236a.get(str);
            if (obj2 != null && obj3 != null) {
                if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z10 = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    continue;
                } else {
                    z10 = obj2.equals(obj3);
                    continue;
                }
            } else if (obj2 == obj3) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f3236a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        HashMap hashMap = this.f3236a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public d(d dVar) {
        this.f3236a = new HashMap(dVar.f3236a);
    }

    public d(HashMap hashMap) {
        this.f3236a = new HashMap(hashMap);
    }
}
