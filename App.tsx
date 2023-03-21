import React from 'react';
import { Text, Button, NativeModules, View, StyleSheet } from 'react-native';

const { AndroidScreen } = NativeModules;

export default function App() {

  const onPressExampleButton = () => {
    AndroidScreen.moveAndroidScreen();
  };

  return (
    <View style={styles.container}>
      <Text style={styles.text}>React Nativeの画面です</Text>
      <Button  title="AARのアプリ画面へ遷移" onPress={onPressExampleButton} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  text: {
    fontSize: 20,
    textAlign: 'center',
    margin: 30,
  },
})