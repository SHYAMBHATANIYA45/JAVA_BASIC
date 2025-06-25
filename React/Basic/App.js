import React from 'react'
import Image from './assets/images/photo.jpg'

function App() {
    console.log(Image)
  return (
    <div>
        <h1>Hello Developer!!!</h1>
        <img src={Image} alt='Image' />
    </div>
  )
}

export default App