package qk;

import android.os.AsyncTask;
import android.os.Build;
import android.security.keystore.KeyProtection;
import androidx.lifecycle.w;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.theinnerhour.b2b.components.chat.model.ChatMessage;
import com.theinnerhour.b2b.components.chat.model.ChatProgress;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.components.chat.model.DecryptionProgress;
import com.theinnerhour.b2b.utils.LogHelper;
import gv.s;
import is.k;
import java.security.Key;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.i;
import org.json.JSONObject;
/* compiled from: ChatHelper.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f29639a = LogHelper.INSTANCE.makeLogTag(c.class);

    /* renamed from: b  reason: collision with root package name */
    public final DatabaseReference f29640b;

    /* renamed from: c  reason: collision with root package name */
    public final KeyStore f29641c;

    /* renamed from: d  reason: collision with root package name */
    public final w<ChatProgress> f29642d;

    /* renamed from: e  reason: collision with root package name */
    public DecryptionProgress f29643e;
    public final w<ArrayList<ChatMessage>> f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<ChatMessage> f29644g;

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f29645h;

    /* renamed from: i  reason: collision with root package name */
    public SecretKey f29646i;

    /* compiled from: ChatHelper.kt */
    /* loaded from: classes2.dex */
    public final class a extends AsyncTask<ChatMessage, Void, ChatMessage> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final ChatMessage doInBackground(ChatMessage[] chatMessageArr) {
            ChatMessage[] params = chatMessageArr;
            i.g(params, "params");
            ChatMessage chatMessage = params[0];
            boolean encrypted = chatMessage.getEncrypted();
            c cVar = c.this;
            if (encrypted) {
                String message = chatMessage.getMessage();
                i.d(message);
                byte[] p10 = hc.d.p(s.k1(32, message));
                String message2 = chatMessage.getMessage();
                i.d(message2);
                String substring = message2.substring(32);
                i.f(substring, "this as java.lang.String).substring(startIndex)");
                byte[] p11 = hc.d.p(substring);
                SecretKey secretKey = cVar.f29646i;
                if (secretKey != null) {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                    cipher.init(2, secretKey, new IvParameterSpec(p10));
                    byte[] byteArray = cipher.doFinal(p11);
                    i.f(byteArray, "byteArray");
                    String str = new String(byteArray, gv.a.f16927b);
                    cVar.f29644g.remove(chatMessage);
                    chatMessage.setMessage(str);
                } else {
                    i.q("keyStoreKey");
                    throw null;
                }
            } else {
                cVar.f29644g.remove(chatMessage);
            }
            return chatMessage;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(ChatMessage chatMessage) {
            ChatMessage result = chatMessage;
            i.g(result, "result");
            c cVar = c.this;
            ArrayList<ChatMessage> d10 = cVar.f.d();
            i.d(d10);
            d10.add(result);
            w<ArrayList<ChatMessage>> wVar = cVar.f;
            wVar.l(wVar.d());
            super.onPostExecute(result);
            ArrayList<ChatMessage> arrayList = cVar.f29644g;
            if (arrayList.size() > 0) {
                new a().execute(arrayList.get(0));
                return;
            }
            DecryptionProgress decryptionProgress = DecryptionProgress.COMPLETED;
            i.g(decryptionProgress, "<set-?>");
            cVar.f29643e = decryptionProgress;
        }
    }

    public c() {
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        i.f(reference, "getInstance().reference");
        this.f29640b = reference;
        this.f29641c = KeyStore.getInstance("AndroidKeyStore");
        this.f29642d = new w<>();
        this.f29643e = DecryptionProgress.COMPLETED;
        this.f = new w<>();
        this.f29644g = new ArrayList<>();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        i.f(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f29645h = newSingleThreadExecutor;
    }

    public static void a(c this$0, String alias, JSONObject jSONObject) {
        i.g(this$0, "this$0");
        KeyStore keyStore = this$0.f29641c;
        w<ChatProgress> wVar = this$0.f29642d;
        i.g(alias, "$alias");
        try {
            String string = jSONObject.getString("key");
            i.f(string, "it.getString(\"key\")");
            byte[] bytes = string.getBytes(gv.a.f16927b);
            i.f(bytes, "this as java.lang.String).getBytes(charset)");
            if (Build.VERSION.SDK_INT >= 23) {
                keyStore.setEntry(alias, new KeyStore.SecretKeyEntry(new SecretKeySpec(bytes, "AES")), new KeyProtection.Builder(3).setBlockModes("CBC").setRandomizedEncryptionRequired(false).setEncryptionPaddings("PKCS7Padding").build());
                Key key = keyStore.getKey(alias, null);
                i.e(key, "null cannot be cast to non-null type javax.crypto.SecretKey");
                this$0.f29646i = (SecretKey) key;
            } else {
                this$0.f29646i = new SecretKeySpec(bytes, "AES");
            }
            wVar.l(ChatProgress.SUCCESS);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f29639a, e10);
            wVar.l(ChatProgress.FAILURE);
        }
    }

    public final void b(final String str, final String messtype, final HashMap hashMap, final ChatUser currentUser, final ChatUser friend, final String str2) {
        i.g(messtype, "messtype");
        i.g(currentUser, "currentUser");
        i.g(friend, "friend");
        this.f29645h.execute(new Runnable() { // from class: qk.b
            @Override // java.lang.Runnable
            public final void run() {
                c this$0 = c.this;
                i.g(this$0, "this$0");
                String message = str;
                i.g(message, "$message");
                String messtype2 = messtype;
                i.g(messtype2, "$messtype");
                ChatUser currentUser2 = currentUser;
                i.g(currentUser2, "$currentUser");
                ChatUser friend2 = friend;
                i.g(friend2, "$friend");
                String channelName = str2;
                i.g(channelName, "$channelName");
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                f fVar = f.f29655u;
                String Y1 = k.Y1(bArr, fVar);
                byte[] bytes = message.getBytes(gv.a.f16927b);
                i.f(bytes, "this as java.lang.String).getBytes(charset)");
                SecretKey secretKey = this$0.f29646i;
                if (secretKey != null) {
                    byte[] p10 = hc.d.p(Y1);
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                    cipher.init(1, secretKey, new IvParameterSpec(p10));
                    byte[] byteArray = cipher.doFinal(bytes);
                    i.f(byteArray, "byteArray");
                    String concat = Y1.concat(k.Y1(byteArray, fVar));
                    ChatMessage chatMessage = new ChatMessage();
                    chatMessage.setMessage(concat);
                    chatMessage.setEncrypted(true);
                    chatMessage.setSource("android");
                    chatMessage.setMessage_type(messtype2);
                    chatMessage.setTime_stamp(Calendar.getInstance().getTimeInMillis() / 1000);
                    chatMessage.setSend_by_user_id(currentUser2.getKey());
                    chatMessage.setUser_name(currentUser2.getName());
                    chatMessage.setSend_to_user_id(friend2.getKey());
                    chatMessage.setSend_to_user_name(friend2.getName());
                    Map map = hashMap;
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.putAll(chatMessage.objectData());
                    DatabaseReference databaseReference = this$0.f29640b;
                    databaseReference.child("channels").child(channelName).child("messages").push().setValue(map);
                    databaseReference.child("channels").child(channelName).child("lastmodified").setValue(Long.valueOf(chatMessage.getTime_stamp()));
                    DatabaseReference child = databaseReference.child("user_friend_map");
                    String key = currentUser2.getKey();
                    i.d(key);
                    DatabaseReference child2 = child.child(key);
                    String key2 = friend2.getKey();
                    i.d(key2);
                    DatabaseReference child3 = child2.child(key2);
                    i.f(child3, "databaseReference.child(…ey!!).child(friend.key!!)");
                    child3.child("info/name").setValue(friend2.getName());
                    child3.child("info/image").setValue(friend2.getProfile_path());
                    child3.child("lastmodified").setValue(Long.valueOf(chatMessage.getTime_stamp()));
                    DatabaseReference child4 = databaseReference.child("user_friend_map");
                    String key3 = friend2.getKey();
                    i.d(key3);
                    DatabaseReference child5 = child4.child(key3);
                    String key4 = currentUser2.getKey();
                    i.d(key4);
                    DatabaseReference child6 = child5.child(key4);
                    i.f(child6, "databaseReference.child(….child(currentUser.key!!)");
                    child6.child("info/name").setValue(currentUser2.getName());
                    child6.child("info/image").setValue(currentUser2.getProfile_path());
                    child6.child("lastmodified").setValue(Long.valueOf(chatMessage.getTime_stamp()));
                    child6.child("unread_messages").push().setValue(map);
                    return;
                }
                i.q("keyStoreKey");
                throw null;
            }
        });
    }
}
