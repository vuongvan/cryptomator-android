package org.cryptomator.domain.exception.vaultconfig;

import org.cryptomator.domain.exception.BackendException;

public class VaultVersionMismatchException extends BackendException {

	public VaultVersionMismatchException(String message) {
		super(message);
	}

}
