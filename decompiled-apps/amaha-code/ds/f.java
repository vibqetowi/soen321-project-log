package ds;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
/* compiled from: Phonemetadata.java */
/* loaded from: classes2.dex */
public final class f implements Externalizable {

    /* renamed from: u  reason: collision with root package name */
    public boolean f13338u;

    /* renamed from: y  reason: collision with root package name */
    public boolean f13342y;

    /* renamed from: v  reason: collision with root package name */
    public String f13339v = "";

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f13340w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f13341x = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    public String f13343z = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f13338u = true;
            this.f13339v = readUTF;
        }
        int readInt = objectInput.readInt();
        for (int i6 = 0; i6 < readInt; i6++) {
            this.f13340w.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i10 = 0; i10 < readInt2; i10++) {
            this.f13341x.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f13342y = true;
            this.f13343z = readUTF2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.f13338u);
        if (this.f13338u) {
            objectOutput.writeUTF(this.f13339v);
        }
        ArrayList arrayList = this.f13340w;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            objectOutput.writeInt(((Integer) arrayList.get(i6)).intValue());
        }
        ArrayList arrayList2 = this.f13341x;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i10 = 0; i10 < size2; i10++) {
            objectOutput.writeInt(((Integer) arrayList2.get(i10)).intValue());
        }
        objectOutput.writeBoolean(this.f13342y);
        if (this.f13342y) {
            objectOutput.writeUTF(this.f13343z);
        }
    }
}
