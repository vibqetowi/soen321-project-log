package com.google.api.client.util.store;

import com.google.android.exoplayer2.util.Util$$ExternalSyntheticApiModelOutline0;
import com.google.api.client.util.IOUtils;
import com.google.api.client.util.Maps;
import com.google.common.base.StandardSystemProperty;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: classes7.dex */
public class FileDataStoreFactory extends AbstractDataStoreFactory {
    private static final boolean IS_WINDOWS = StandardSystemProperty.OS_NAME.value().toLowerCase(Locale.ENGLISH).startsWith("windows");
    private final File dataDirectory;

    public FileDataStoreFactory(File file) throws IOException {
        File canonicalFile = file.getCanonicalFile();
        if (IOUtils.isSymbolicLink(canonicalFile)) {
            throw new IOException("unable to use a symbolic link: " + canonicalFile);
        } else if (!canonicalFile.exists() && !canonicalFile.mkdirs()) {
            throw new IOException("unable to create directory: " + canonicalFile);
        } else {
            this.dataDirectory = canonicalFile;
            if (IS_WINDOWS) {
                setPermissionsToOwnerOnlyWindows(canonicalFile);
            } else {
                setPermissionsToOwnerOnly(canonicalFile);
            }
        }
    }

    public final File getDataDirectory() {
        return this.dataDirectory;
    }

    @Override // com.google.api.client.util.store.AbstractDataStoreFactory
    protected <V extends Serializable> DataStore<V> createDataStore(String str) throws IOException {
        return new FileDataStore(this, this.dataDirectory, str);
    }

    /* loaded from: classes7.dex */
    static class FileDataStore<V extends Serializable> extends AbstractMemoryDataStore<V> {
        private final File dataFile;

        FileDataStore(FileDataStoreFactory fileDataStoreFactory, File file, String str) throws IOException {
            super(fileDataStoreFactory, str);
            File file2 = new File(file, str);
            this.dataFile = file2;
            if (IOUtils.isSymbolicLink(file2)) {
                throw new IOException("unable to use a symbolic link: " + file2);
            } else if (file2.createNewFile()) {
                this.keyValueMap = Maps.newHashMap();
                save();
            } else {
                this.keyValueMap = (HashMap) IOUtils.deserialize(new FileInputStream(file2));
            }
        }

        @Override // com.google.api.client.util.store.AbstractMemoryDataStore
        public void save() throws IOException {
            IOUtils.serialize(this.keyValueMap, new FileOutputStream(this.dataFile));
        }

        @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
        public FileDataStoreFactory getDataStoreFactory() {
            return (FileDataStoreFactory) super.getDataStoreFactory();
        }
    }

    private static void setPermissionsToOwnerOnly(File file) throws IOException {
        PosixFilePermission posixFilePermission;
        PosixFilePermission posixFilePermission2;
        PosixFilePermission posixFilePermission3;
        Path path;
        HashSet hashSet = new HashSet();
        posixFilePermission = PosixFilePermission.OWNER_READ;
        hashSet.add(posixFilePermission);
        posixFilePermission2 = PosixFilePermission.OWNER_WRITE;
        hashSet.add(posixFilePermission2);
        posixFilePermission3 = PosixFilePermission.OWNER_EXECUTE;
        hashSet.add(posixFilePermission3);
        try {
            path = Paths.get(file.getAbsolutePath(), new String[0]);
            Files.setPosixFilePermissions(path, hashSet);
        } catch (RuntimeException e) {
            throw new IOException("Unable to set permissions for " + file, e);
        }
    }

    private static void setPermissionsToOwnerOnlyWindows(File file) throws IOException {
        Path path;
        FileAttributeView fileAttributeView;
        UserPrincipal owner;
        FileAttributeView fileAttributeView2;
        AclEntryPermission aclEntryPermission;
        AclEntryPermission aclEntryPermission2;
        AclEntryPermission aclEntryPermission3;
        AclEntryPermission aclEntryPermission4;
        AclEntryPermission aclEntryPermission5;
        AclEntryPermission aclEntryPermission6;
        AclEntryPermission aclEntryPermission7;
        AclEntryPermission aclEntryPermission8;
        AclEntryPermission aclEntryPermission9;
        AclEntryPermission aclEntryPermission10;
        AclEntryPermission aclEntryPermission11;
        AclEntryPermission aclEntryPermission12;
        AclEntryPermission aclEntryPermission13;
        AclEntry.Builder newBuilder;
        AclEntryType aclEntryType;
        AclEntry.Builder type;
        AclEntry.Builder principal;
        AclEntry.Builder permissions2;
        AclEntry build;
        path = Paths.get(file.getAbsolutePath(), new String[0]);
        fileAttributeView = Files.getFileAttributeView(path, Util$$ExternalSyntheticApiModelOutline0.m$1(), new LinkOption[0]);
        owner = Util$$ExternalSyntheticApiModelOutline0.m6608m((Object) fileAttributeView).getOwner();
        fileAttributeView2 = Files.getFileAttributeView(path, Util$$ExternalSyntheticApiModelOutline0.m6603m(), new LinkOption[0]);
        AclFileAttributeView m = Util$$ExternalSyntheticApiModelOutline0.m((Object) fileAttributeView2);
        aclEntryPermission = AclEntryPermission.APPEND_DATA;
        aclEntryPermission2 = AclEntryPermission.DELETE;
        aclEntryPermission3 = AclEntryPermission.DELETE_CHILD;
        aclEntryPermission4 = AclEntryPermission.READ_ACL;
        aclEntryPermission5 = AclEntryPermission.READ_ATTRIBUTES;
        aclEntryPermission6 = AclEntryPermission.READ_DATA;
        aclEntryPermission7 = AclEntryPermission.READ_NAMED_ATTRS;
        aclEntryPermission8 = AclEntryPermission.SYNCHRONIZE;
        aclEntryPermission9 = AclEntryPermission.WRITE_ACL;
        aclEntryPermission10 = AclEntryPermission.WRITE_ATTRIBUTES;
        aclEntryPermission11 = AclEntryPermission.WRITE_DATA;
        aclEntryPermission12 = AclEntryPermission.WRITE_NAMED_ATTRS;
        aclEntryPermission13 = AclEntryPermission.WRITE_OWNER;
        ImmutableSet of = ImmutableSet.of(aclEntryPermission, aclEntryPermission2, aclEntryPermission3, aclEntryPermission4, aclEntryPermission5, aclEntryPermission6, aclEntryPermission7, aclEntryPermission8, aclEntryPermission9, aclEntryPermission10, aclEntryPermission11, aclEntryPermission12, aclEntryPermission13);
        newBuilder = AclEntry.newBuilder();
        aclEntryType = AclEntryType.ALLOW;
        type = newBuilder.setType(aclEntryType);
        principal = type.setPrincipal(owner);
        permissions2 = principal.setPermissions(of);
        build = permissions2.build();
        try {
            m.setAcl(ImmutableList.of(build));
        } catch (SecurityException e) {
            throw new IOException("Unable to set permissions for " + file, e);
        }
    }
}
