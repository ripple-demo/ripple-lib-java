package org.ripple.bouncycastle.openpgp.operator;

import org.ripple.bouncycastle.openpgp.PGPException;

public interface PGPDataDecryptorFactory
{
    public PGPDataDecryptor createDataDecryptor(boolean withIntegrityPacket, int encAlgorithm, byte[] key)
        throws PGPException;
}
