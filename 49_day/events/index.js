import { EventEmitter } from 'node:events';

const emitter=new EventEmitter()

emitter.on('tick',(dt)=>{console.log('called '+dt) })

emitter.emit('tick',1)