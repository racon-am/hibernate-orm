/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.envers.test.integration.reventity.removal;

import org.hibernate.envers.enhanced.SequenceIdRevisionEntity;

/**
 * @author Lukasz Antoniak (lukasz dot antoniak at gmail dot com)
 */
public class RemoveDefaultRevisionEntity extends AbstractRevisionEntityRemovalTest {
	@Override
	protected Class<?> getRevisionEntityClass() {
		return SequenceIdRevisionEntity.class;
	}
}
