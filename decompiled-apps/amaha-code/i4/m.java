package i4;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;
/* compiled from: StreamLocalUriFetcher.java */
/* loaded from: classes.dex */
public final class m extends k<InputStream> {

    /* renamed from: x  reason: collision with root package name */
    public static final UriMatcher f19830x;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f19830x = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public m(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // i4.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // i4.k
    public final void d(InputStream inputStream) {
        inputStream.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    @Override // i4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContentResolver contentResolver, Uri uri) {
        InputStream openContactPhotoInputStream;
        int match = f19830x.match(uri);
        if (match != 1) {
            if (match != 3) {
                if (match != 5) {
                    openContactPhotoInputStream = contentResolver.openInputStream(uri);
                }
            } else {
                openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
            }
            if (openContactPhotoInputStream == null) {
                return openContactPhotoInputStream;
            }
            throw new FileNotFoundException("InputStream is null for " + uri);
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, lookupContact, true);
            if (openContactPhotoInputStream == null) {
            }
        } else {
            throw new FileNotFoundException("Contact cannot be found");
        }
    }
}
