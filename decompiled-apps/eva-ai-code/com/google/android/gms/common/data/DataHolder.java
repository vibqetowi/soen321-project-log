package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    private static final Builder zaf = new zab(new String[0], null);
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;
    private final String[] zag;
    private final CursorWindow[] zah;
    private final int zai;
    private final Bundle zaj;
    private boolean zak;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private final String[] zaa;
        private final ArrayList<HashMap<String, Object>> zab = new ArrayList<>();
        private final HashMap<Object, Integer> zac = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        public DataHolder build(int i) {
            return new DataHolder(this, i);
        }

        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        public Builder zaa(HashMap<String, Object> hashMap) {
            Asserts.checkNotNull(hashMap);
            this.zab.add(hashMap);
            return this;
        }

        public DataHolder build(int i, Bundle bundle) {
            return new DataHolder(this, i, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i2;
        this.zaj = bundle;
    }

    public static Builder builder(String[] strArr) {
        return new Builder(strArr, null, null);
    }

    public static DataHolder empty(int i) {
        return new DataHolder(zaf, i, (Bundle) null);
    }

    private final void zae(String str, int i) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (!isClosed()) {
            if (i < 0 || i >= this.zad) {
                throw new CursorIndexOutOfBoundsException(i, this.zad);
            }
        } else {
            throw new IllegalArgumentException("Buffer is closed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0144, code lost:
        if (r5 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0146, code lost:
        r5 = new java.lang.StringBuilder(74);
        r5.append("Couldn't populate window data for row ");
        r5.append(r4);
        r5.append(" - allocating new window.");
        android.util.Log.d("DataHolder", r5.toString());
        r2.freeLastRow();
        r2 = new android.database.CursorWindow(false);
        r2.setStartPosition(r4);
        r2.setNumColumns(r13.zaa.length);
        r3.add(r2);
        r4 = r4 - 1;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017a, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0184, code lost:
        throw new com.google.android.gms.common.data.zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static CursorWindow[] zaf(Builder builder, int i) {
        if (builder.zaa.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    StringBuilder sb = new StringBuilder(72);
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i2);
                    sb.append(")");
                    Log.d("DataHolder", sb.toString());
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i2);
                int i3 = 0;
                boolean z2 = true;
                while (true) {
                    if (i3 < builder.zaa.length) {
                        if (!z2) {
                            break;
                        }
                        String str = builder.zaa[i3];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z2 = cursorWindow.putNull(i2, i3);
                        } else if (obj instanceof String) {
                            z2 = cursorWindow.putString((String) obj, i2, i3);
                        } else if (obj instanceof Long) {
                            z2 = cursorWindow.putLong(((Long) obj).longValue(), i2, i3);
                        } else if (obj instanceof Integer) {
                            z2 = cursorWindow.putLong(((Integer) obj).intValue(), i2, i3);
                        } else if (obj instanceof Boolean) {
                            z2 = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i2, i3);
                        } else if (obj instanceof byte[]) {
                            z2 = cursorWindow.putBlob((byte[]) obj, i2, i3);
                        } else if (obj instanceof Double) {
                            z2 = cursorWindow.putDouble(((Double) obj).doubleValue(), i2, i3);
                        } else if (obj instanceof Float) {
                            z2 = cursorWindow.putDouble(((Float) obj).floatValue(), i2, i3);
                        } else {
                            String obj2 = obj.toString();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + obj2.length());
                            sb2.append("Unsupported object for column ");
                            sb2.append(str);
                            sb2.append(": ");
                            sb2.append(obj2);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        i3++;
                    } else if (z2) {
                        z = false;
                    }
                }
            } catch (RuntimeException e) {
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((CursorWindow) arrayList2.get(i4)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.zae) {
                this.zae = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.zah;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public boolean getBoolean(String str, int i, int i2) {
        zae(str, i);
        return Long.valueOf(this.zah[i2].getLong(i, this.zab.getInt(str))).longValue() == 1;
    }

    public byte[] getByteArray(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getBlob(i, this.zab.getInt(str));
    }

    public int getCount() {
        return this.zad;
    }

    public int getInteger(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getInt(i, this.zab.getInt(str));
    }

    public long getLong(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getLong(i, this.zab.getInt(str));
    }

    public Bundle getMetadata() {
        return this.zaj;
    }

    public int getStatusCode() {
        return this.zai;
    }

    public String getString(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getString(i, this.zab.getInt(str));
    }

    public int getWindowIndex(int i) {
        int length;
        int i2 = 0;
        Preconditions.checkState(i >= 0 && i < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i2 >= length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == length ? i2 - 1 : i2;
    }

    public boolean hasColumn(String str) {
        return this.zab.containsKey(str);
    }

    public boolean hasNull(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].isNull(i, this.zab.getInt(str));
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.zae;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.zag, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final double zaa(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getDouble(i, this.zab.getInt(str));
    }

    public final float zab(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getFloat(i, this.zab.getInt(str));
    }

    public final void zac(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        zae(str, i);
        this.zah[i2].copyStringToBuffer(i, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i2 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i2], i2);
            i2++;
        }
        this.zac = new int[this.zah.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i >= cursorWindowArr.length) {
                this.zad = i3;
                return;
            }
            this.zac[i] = i3;
            i3 += this.zah[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
            i++;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DataHolder(Cursor cursor, int i, Bundle bundle) {
        this(r8, (CursorWindow[]) r1.toArray(new CursorWindow[r1.size()]), i, bundle);
        int i2;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i2 = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                i2 = window.getNumRows();
            }
            while (i2 < count) {
                if (!cursorWrapper.moveToPosition(i2)) {
                    break;
                }
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(i2);
                    cursorWrapper.fillWindow(i2, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                i2 = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    private DataHolder(Builder builder, int i, Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i, (Bundle) null);
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i;
        this.zaj = bundle;
        zad();
    }
}
