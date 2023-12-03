package rk;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.theinnerhour.b2b.components.chat.model.ChatMessage;
import com.theinnerhour.b2b.components.chat.model.DecryptionProgress;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import qk.c;
/* compiled from: ChatViewModel.kt */
/* loaded from: classes2.dex */
public final class c implements ChildEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f30772a;

    public c(f fVar) {
        this.f30772a = fVar;
    }

    @Override // com.google.firebase.database.ChildEventListener
    public final void onCancelled(DatabaseError databaseError) {
        i.g(databaseError, "databaseError");
    }

    @Override // com.google.firebase.database.ChildEventListener
    public final void onChildAdded(DataSnapshot dataSnapshot, String str) {
        i.g(dataSnapshot, "dataSnapshot");
        Object value = dataSnapshot.getValue();
        f fVar = this.f30772a;
        if (value != null) {
            ChatMessage chatMessage = (ChatMessage) dataSnapshot.getValue(ChatMessage.class);
            qk.c cVar = fVar.E;
            i.d(chatMessage);
            cVar.getClass();
            ArrayList<ChatMessage> arrayList = cVar.f29644g;
            arrayList.add(chatMessage);
            DecryptionProgress decryptionProgress = cVar.f29643e;
            DecryptionProgress decryptionProgress2 = DecryptionProgress.DECRYPTING;
            if (decryptionProgress != decryptionProgress2) {
                cVar.f29643e = decryptionProgress2;
                new c.a().execute(arrayList.get(0));
            }
        }
        DatabaseReference child = fVar.D.child("user_friend_map");
        DatabaseReference child2 = child.child("" + fVar.f30783x.getKey());
        child2.child("" + fVar.f30784y.getKey()).child("unread_messages").removeValue();
    }

    @Override // com.google.firebase.database.ChildEventListener
    public final void onChildChanged(DataSnapshot dataSnapshot, String str) {
        i.g(dataSnapshot, "dataSnapshot");
    }

    @Override // com.google.firebase.database.ChildEventListener
    public final void onChildMoved(DataSnapshot dataSnapshot, String str) {
        i.g(dataSnapshot, "dataSnapshot");
    }

    @Override // com.google.firebase.database.ChildEventListener
    public final void onChildRemoved(DataSnapshot dataSnapshot) {
        i.g(dataSnapshot, "dataSnapshot");
    }
}
