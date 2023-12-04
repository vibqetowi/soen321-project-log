package androidx.security.crypto;

import android.content.Context;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager;
import com.google.crypto.tink.streamingaead.StreamingAeadConfig;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
/* loaded from: classes3.dex */
public final class EncryptedFile {
    private static final String KEYSET_ALIAS = "__androidx_security_crypto_encrypted_file_keyset__";
    private static final String KEYSET_PREF_NAME = "__androidx_security_crypto_encrypted_file_pref__";
    final Context mContext;
    final File mFile;
    final String mMasterKeyAlias;
    final StreamingAead mStreamingAead;

    EncryptedFile(File file, String masterKeyAlias, StreamingAead streamingAead, Context context) {
        this.mFile = file;
        this.mContext = context;
        this.mMasterKeyAlias = masterKeyAlias;
        this.mStreamingAead = streamingAead;
    }

    /* loaded from: classes3.dex */
    public enum FileEncryptionScheme {
        AES256_GCM_HKDF_4KB(AesGcmHkdfStreamingKeyManager.aes256GcmHkdf4KBTemplate());
        
        private final KeyTemplate mStreamingAeadKeyTemplate;

        FileEncryptionScheme(KeyTemplate keyTemplate) {
            this.mStreamingAeadKeyTemplate = keyTemplate;
        }

        KeyTemplate getKeyTemplate() {
            return this.mStreamingAeadKeyTemplate;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        final Context mContext;
        File mFile;
        final FileEncryptionScheme mFileEncryptionScheme;
        final String mMasterKeyAlias;
        String mKeysetPrefName = EncryptedFile.KEYSET_PREF_NAME;
        String mKeysetAlias = EncryptedFile.KEYSET_ALIAS;

        @Deprecated
        public Builder(File file, Context context, String masterKeyAlias, FileEncryptionScheme fileEncryptionScheme) {
            this.mFile = file;
            this.mFileEncryptionScheme = fileEncryptionScheme;
            this.mContext = context.getApplicationContext();
            this.mMasterKeyAlias = masterKeyAlias;
        }

        public Builder(Context context, File file, MasterKey masterKey, FileEncryptionScheme fileEncryptionScheme) {
            this.mFile = file;
            this.mFileEncryptionScheme = fileEncryptionScheme;
            this.mContext = context.getApplicationContext();
            this.mMasterKeyAlias = masterKey.getKeyAlias();
        }

        public Builder setKeysetPrefName(String keysetPrefName) {
            this.mKeysetPrefName = keysetPrefName;
            return this;
        }

        public Builder setKeysetAlias(String keysetAlias) {
            this.mKeysetAlias = keysetAlias;
            return this;
        }

        public EncryptedFile build() throws GeneralSecurityException, IOException {
            StreamingAeadConfig.register();
            AndroidKeysetManager.Builder withSharedPref = new AndroidKeysetManager.Builder().withKeyTemplate(this.mFileEncryptionScheme.getKeyTemplate()).withSharedPref(this.mContext, this.mKeysetAlias, this.mKeysetPrefName);
            return new EncryptedFile(this.mFile, this.mKeysetAlias, (StreamingAead) withSharedPref.withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + this.mMasterKeyAlias).build().getKeysetHandle().getPrimitive(StreamingAead.class), this.mContext);
        }
    }

    public FileOutputStream openFileOutput() throws GeneralSecurityException, IOException {
        if (this.mFile.exists()) {
            throw new IOException("output file already exists, please use a new file: " + this.mFile.getName());
        }
        FileOutputStream fileOutputStream = new FileOutputStream(this.mFile);
        return new EncryptedFileOutputStream(fileOutputStream.getFD(), this.mStreamingAead.newEncryptingStream(fileOutputStream, this.mFile.getName().getBytes(StandardCharsets.UTF_8)));
    }

    public FileInputStream openFileInput() throws GeneralSecurityException, IOException {
        if (!this.mFile.exists()) {
            throw new IOException("file doesn't exist: " + this.mFile.getName());
        }
        FileInputStream fileInputStream = new FileInputStream(this.mFile);
        return new EncryptedFileInputStream(fileInputStream.getFD(), this.mStreamingAead.newDecryptingStream(fileInputStream, this.mFile.getName().getBytes(StandardCharsets.UTF_8)));
    }

    /* loaded from: classes3.dex */
    private static final class EncryptedFileOutputStream extends FileOutputStream {
        private final OutputStream mEncryptedOutputStream;

        EncryptedFileOutputStream(FileDescriptor descriptor, OutputStream encryptedOutputStream) {
            super(descriptor);
            this.mEncryptedOutputStream = encryptedOutputStream;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(byte[] b) throws IOException {
            this.mEncryptedOutputStream.write(b);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(int b) throws IOException {
            this.mEncryptedOutputStream.write(b);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(byte[] b, int off, int len) throws IOException {
            this.mEncryptedOutputStream.write(b, off, len);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mEncryptedOutputStream.close();
        }

        @Override // java.io.FileOutputStream
        public FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.mEncryptedOutputStream.flush();
        }
    }

    /* loaded from: classes3.dex */
    private static final class EncryptedFileInputStream extends FileInputStream {
        private final InputStream mEncryptedInputStream;

        EncryptedFileInputStream(FileDescriptor descriptor, InputStream encryptedInputStream) {
            super(descriptor);
            this.mEncryptedInputStream = encryptedInputStream;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read() throws IOException {
            return this.mEncryptedInputStream.read();
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(byte[] b) throws IOException {
            return this.mEncryptedInputStream.read(b);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(byte[] b, int off, int len) throws IOException {
            return this.mEncryptedInputStream.read(b, off, len);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public long skip(long n) throws IOException {
            return this.mEncryptedInputStream.skip(n);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int available() throws IOException {
            return this.mEncryptedInputStream.available();
        }

        @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mEncryptedInputStream.close();
        }

        @Override // java.io.FileInputStream
        public FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.InputStream
        public synchronized void mark(int readlimit) {
            this.mEncryptedInputStream.mark(readlimit);
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            this.mEncryptedInputStream.reset();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.mEncryptedInputStream.markSupported();
        }
    }
}
