package ds;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
/* compiled from: Phonemetadata.java */
/* loaded from: classes2.dex */
public final class d implements Externalizable {
    public boolean A;

    /* renamed from: x  reason: collision with root package name */
    public boolean f13308x;

    /* renamed from: u  reason: collision with root package name */
    public String f13305u = "";

    /* renamed from: v  reason: collision with root package name */
    public String f13306v = "";

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f13307w = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public String f13309y = "";

    /* renamed from: z  reason: collision with root package name */
    public boolean f13310z = false;
    public String B = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.f13305u = objectInput.readUTF();
        this.f13306v = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i6 = 0; i6 < readInt; i6++) {
            this.f13307w.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f13308x = true;
            this.f13309y = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.A = true;
            this.B = readUTF2;
        }
        this.f13310z = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f13305u);
        objectOutput.writeUTF(this.f13306v);
        ArrayList arrayList = this.f13307w;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            objectOutput.writeUTF((String) arrayList.get(i6));
        }
        objectOutput.writeBoolean(this.f13308x);
        if (this.f13308x) {
            objectOutput.writeUTF(this.f13309y);
        }
        objectOutput.writeBoolean(this.A);
        if (this.A) {
            objectOutput.writeUTF(this.B);
        }
        objectOutput.writeBoolean(this.f13310z);
    }
}
