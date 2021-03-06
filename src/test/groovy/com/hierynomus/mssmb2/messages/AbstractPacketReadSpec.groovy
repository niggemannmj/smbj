/*
 * Copyright (C)2016 - SMBJ Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hierynomus.mssmb2.messages

import com.hierynomus.mssmb2.SMB2MessageConverter
import com.hierynomus.mssmb2.SMB2PacketData
import spock.lang.Shared
import spock.lang.Specification

class AbstractPacketReadSpec extends Specification {
  @Shared
  def converter = new SMB2MessageConverter()

  def convert(byte[] bytes) {
    def packetData = new SMB2PacketData(bytes)
    return converter.readPacket(null, packetData)
  }
}
