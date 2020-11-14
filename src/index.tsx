import { NativeModules } from 'react-native';

type DeviceSettingType = {
  multiply(a: number, b: number): Promise<number>;
};

const { DeviceSetting } = NativeModules;

export default DeviceSetting as DeviceSettingType;
